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
    public void guardar(Pasajero pasajero) {
        String sql = "INSERT INTO `pasajero`(`Nombre`, `Apellido`, `DNI`, `Correo`, `Teléfono`,`Estado`)" + " VALUES (?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, pasajero.getNombre());
            ps.setString(2, pasajero.getApellido());
            ps.setInt(3, pasajero.getDni());
            ps.setString(4, pasajero.getCorreo());
            ps.setString(5, pasajero.getTelefono());
            ps.setBoolean(6, pasajero.isEstado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                pasajero.setIdPasajero(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Pasajero agregado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el acceso a la tabla pasajero. " + ex);
        }
    }

    //LISTARPASAJEROS
    public List<Pasajero> listarPasajeros() {
        ArrayList<Pasajero> pasajeroAux = new ArrayList<>();

        String sql = "SELECT * FROM `pasajero`";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                pasajeroAux.add(new Pasajero(rs.getInt("ID_Pasajero"), rs.getString("Nombre"), rs.getString("Apellido"), rs.getInt("DNI"), rs.getString("Correo"), rs.getString("Teléfono"), rs.getBoolean("estado")));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasajero. ");
        }
        return pasajeroAux;
    }

//    //BUSCAR POR NOMBRE
//    public List<Pasajero> buscarNombre(String nombre) {
//        List<Pasajero> pasajeros = new ArrayList();
//        String sql = "SELECT * FROM `pasajero` WHERE Nombre LIKE ?";
//
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setString(1, nombre + "%");
//            ResultSet rs = ps.executeQuery();
//            while(rs.next()){
//                Pasajero pasajero = new Pasajero(rs.getInt("ID_Pasajero"), rs.getString("Nombre"), rs.getString("Apellido"), rs.getInt("DNI"), rs.getString("Correo"), rs.getString("Teléfono"), rs.getBoolean("estado"));
//                pasajeros.add(pasajero);
//            }
//            return pasajeros;
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasajero. " + ex);
//        }
//        return null;
//    }
//
//    //BUSCAR POR APELLIDO
//    public List<Pasajero> buscarApellido(String apellido) {
//        List<Pasajero> pasajeros = new ArrayList();
//        String sql = "SELECT * FROM `pasajero` WHERE Apellido LIKE ?";
//
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setString(1, apellido + "%");
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                Pasajero pasajero = new Pasajero(rs.getInt("ID_Pasajero"), rs.getString("Nombre"), rs.getString("Apellido"), rs.getInt("DNI"), rs.getString("Correo"), rs.getString("Teléfono"), rs.getBoolean("estado"));
//                pasajeros.add(pasajero);
//            }
//            ps.close();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasajero. " + ex);
//        }
//        return null;
//    }
//
//    //BUSCAR POR DNI
//    public List<Pasajero> buscarDNI(int dni) {
//        List<Pasajero> pasajeros = new ArrayList();
//        String sql = "SELECT * FROM `pasajero` WHERE DNI LIKE ?";
//
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setString(1, dni + "%");
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                Pasajero pasajero = new Pasajero(rs.getInt("ID_Pasajero"), rs.getString("Nombre"), rs.getString("Apellido"), rs.getInt("DNI"), rs.getString("Correo"), rs.getString("Teléfono"), rs.getBoolean("estado"));
//                pasajeros.add(pasajero);
//            }
//            ps.close();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasajero. " + ex);
//        }
//        return null;
//    }
//    
//    //BUSCAR POR ID
//    public Pasajero buscarPorID(int ID) {
//        String sql = "SELECT * FROM `pasajero` WHERE ID_Pasajero = " + ID;
//
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            if (rs.next()) {
//                return new Pasajero(rs.getInt("ID_Pasajero"), rs.getString("Nombre"), rs.getString("Apellido"), rs.getInt("DNI"), rs.getString("Correo"), rs.getString("Teléfono"), rs.getBoolean("estado"));
//            }
//            ps.close();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasajero. " + ex);
//        }
//        return null;
//    }
    
    //MODIFICAR PASAJERO
    public void modificar(Pasajero pasajero) {
        String sql = "UPDATE pasajero SET Nombre = ?, Apellido = ?, DNI = ?, Correo = ?, Teléfono = ?, Estado = ? WHERE ID_Pasajero = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, pasajero.getNombre());
            ps.setString(2, pasajero.getApellido());
            ps.setInt(3, pasajero.getDni());
            ps.setString(4, pasajero.getCorreo());
            ps.setString(5, pasajero.getTelefono());
            ps.setBoolean(6, pasajero.isEstado());
            ps.setInt(7, pasajero.getIdPasajero());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Pasajero modificado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasajero. " + ex);
        }
    }

    //ELIMINAR PASAJERO
    public void eliminar(int ID_Pasajero) {
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
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasajero. " + ex);
        }
    }
    
    public Pasajero buscar(String clasificacion, Object objeto) {
        PreparedStatement ps; ResultSet rs;
        
        try {
            switch (clasificacion) {
                case "Nombre":
                    ps = con.prepareStatement("SELECT * FROM `pasajero` WHERE Nombre LIKE ?");
                    ps.setString(1, objeto + "%");
                    rs = ps.executeQuery();
                    break;
                case "Apellido":
                    ps = con.prepareStatement("SELECT * FROM `pasajero` WHERE Apellido LIKE ?");
                    ps.setString(1, objeto + "%");
                    rs = ps.executeQuery();
                    break;
                case "DNI":
                    ps = con.prepareStatement("SELECT * FROM `pasajero` WHERE DNI LIKE ?");
                    ps.setInt(1, Integer.parseInt(objeto + "%"));
                    rs = ps.executeQuery();
                    break;
                case "ID":
                    ps = con.prepareStatement("SELECT * FROM `pasajero` WHERE ID_Pasajero = ?");
                    ps.setInt(1, (int) objeto);
                    rs = ps.executeQuery();
                    break;
                default:
                    ps = con.prepareStatement("SELECT * FROM `pasajero`");
                    rs = ps.executeQuery();
                    break;
            }
            if (rs.next()) {
                return new Pasajero(rs.getInt("ID_Pasajero"), rs.getString("Nombre"), rs.getString("Apellido"), rs.getInt("DNI"), rs.getString("Correo"), rs.getString("Teléfono"), rs.getBoolean("estado"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasajero. " + ex);
        }
        return null;
    }
    
    public List<Pasajero> buscar_Lista(String clasificacion, Object objeto) {
        List<Pasajero> pasajeros = new ArrayList();
        PreparedStatement ps; ResultSet rs;
        
        try {
            switch (clasificacion) {
                case "Nombre":
                    ps = con.prepareStatement("SELECT * FROM `pasajero` WHERE Nombre LIKE ?");
                    ps.setString(1, objeto + "%");
                    rs = ps.executeQuery();
                    break;
                case "Apellido":
                    ps = con.prepareStatement("SELECT * FROM `pasajero` WHERE Apellido LIKE ?");
                    ps.setString(1, objeto + "%");
                    rs = ps.executeQuery();
                    break;
                case "DNI":
                    ps = con.prepareStatement("SELECT * FROM `pasajero` WHERE DNI LIKE ?");
                    ps.setInt(1, Integer.parseInt(objeto + "%"));
                    rs = ps.executeQuery();
                    break;
                case "ID":
                    ps = con.prepareStatement("SELECT * FROM `pasajero` WHERE ID_Pasajero = ?");
                    ps.setInt(1, (int) objeto);
                    rs = ps.executeQuery();
                    break;
                default:
                    ps = con.prepareStatement("SELECT * FROM `pasajero`");
                    rs = ps.executeQuery();
                    break;
            }
            while (rs.next()) {
                Pasajero pasajero = new Pasajero(rs.getInt("ID_Pasajero"), rs.getString("Nombre"), rs.getString("Apellido"), rs.getInt("DNI"), rs.getString("Correo"), rs.getString("Teléfono"), rs.getBoolean("estado"));
                pasajeros.add(pasajero);
            }
            return pasajeros;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasajero. " + ex);
        }
        return null;
    }
}
