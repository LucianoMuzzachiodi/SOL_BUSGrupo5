package sol_busgrupo5.accesoADatos;

import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import sol_busgrupo5.entidades.Pasajero;

public class PasajeroData {
    private Connection con;

    public PasajeroData() {
         con = Conexion.getConexion();
    }
    
    //GUARDAR PASAJERO
    public void guardar(Pasajero pasajero){
        String sql = "INSERT INTO `pasajero`(`Nombre`, `Apellido`, `DNI`, `Correo`, `Teléfono`)" + " VALUES (?,?,?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, pasajero.getNombre());
            ps.setString(2, pasajero.getApellido());
            ps.setInt(3, pasajero.getDni());
            ps.setString(4, pasajero.getCorreo());
            ps.setString(5, pasajero.getTelefono());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                pasajero.setIdPasajero(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Pasajero agregado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el acceso a la tabla pasajero" + ex);
        }
    }
    
    //LISTARPASAJEROS
    public List<Pasajero> listarPasajeros() {
        ArrayList<Pasajero> pasajeroAux = new ArrayList<>();
            
        String sql = "SELECT * FROM `pasajero`";
            
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Pasajero pasajero = new Pasajero(rs.getInt("id_Pasajero"), rs.getString("nombre"), rs.getString("apellido"), rs.getInt("dni"), rs.getString("correo"), rs.getString("teléfono"),rs.getBoolean("estado"));
                pasajeroAux.add(pasajero);
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasajero");
        }   
        return pasajeroAux;
        }
    
    //BUSCAR POR NOMBRE
    public Pasajero buscarNombre(String nombre){
        Pasajero pasajeroAux = new Pasajero();
        
        String sql = "SELECT * FROM `pasajero` WHERE Nombre = ?";
        
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                pasajeroAux = new Pasajero(rs.getInt("ID_Pasajero"), rs.getString("nombre"), rs.getString("apellido"), rs.getInt("dni"), rs.getString("correo"), rs.getString("teléfono"),rs.getBoolean("estado"));
                
                return pasajeroAux;
            }else {
                JOptionPane.showMessageDialog(null, "No existe el Pasajero");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasajero" + ex);
        }
        
        return null;
    }
    
    //BUSCAR POR APELLIDO
    public Pasajero buscarApellido(String apellido){
        Pasajero pasajeroAux = new Pasajero();
        
        String sql = "SELECT * FROM `pasajero` WHERE Apellido = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, apellido);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                pasajeroAux = new Pasajero(rs.getInt("id_Pasajero"), rs.getString("nombre"), rs.getString("apellido"), rs.getInt("dni"), rs.getString("correo"), rs.getString("teléfono"),rs.getBoolean("estado"));
                
                return pasajeroAux;
            } else {
                JOptionPane.showMessageDialog(null, "No existe el Pasajero");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasajero" + ex);
        }
         return null;
    }
   
    
    //BUSCAR POR DNI
    public Pasajero buscar(int dni){
        Pasajero pasajeroAux = new Pasajero();
        
        String sql = "SELECT * FROM `pasajero` WHERE DNI = " + dni;
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                pasajeroAux = new Pasajero(rs.getInt("id_Pasajero"), rs.getString("nombre"), rs.getString("apellido"), rs.getInt("dni"), rs.getString("correo"), rs.getString("teléfono"),rs.getBoolean("estado"));

                return pasajeroAux;
            } else {
                JOptionPane.showMessageDialog(null, "No existe el Pasajero");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasajero" + ex);
        }
           return null;     
    }
    
    
    //MODIFICAR PASAJERO
    public void modificar(Pasajero pasajero){
        String sql = "UPDATE pasajero SET Nombre = ?, Apellido = ?, DNI = ?, Correo = ?, Teléfono = ? WHERE ID_Pasajero = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, pasajero.getNombre());
            ps.setString(2, pasajero.getApellido());
            ps.setInt(3, pasajero.getDni());
            ps.setString(4, pasajero.getCorreo());
            ps.setString(5, pasajero.getTelefono());
            ps.setInt(6, pasajero.getIdPasajero());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Pasajero modificado");
            } else {
                JOptionPane.showMessageDialog(null, "El pasajero no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasajero" + ex);
        }
    }
    
    
    //ELIMINAR PASAJERO
    public void eliminar(int ID_Pasajero){
        try {
            String sql = "UPDATE pasajero SET estado = 0 WHERE ID_Pasajero = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ID_Pasajero);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se eliminó el pasajero");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pasajero" + ex);
        }
    }
}
