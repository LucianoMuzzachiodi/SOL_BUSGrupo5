package sol_busgrupo5.accesoADatos;

import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import sol_busgrupo5.entidades.*;

public class RutaData {
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

    public RutaData() {
        con = Conexion.getConexion();
    }

    //AGREGAR RUTA
    public void agregarRuta(Ruta ruta) {
        String sql = "INSERT INTO `ruta`(`Origen`, `Destino`, `Duración_Estimada`, `Estado`)" + " VALUES (?,?,?,?)";

        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, ruta.getOrigen());
            ps.setString(2, ruta.getDestino());
            ps.setTime(3, ruta.getDuracionEstimada());
            ps.setBoolean(4, ruta.isEstado());
            ps.executeUpdate();

            rs = ps.getGeneratedKeys();
            if (rs.next()) {
                ruta.setIdRuta(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Ruta agregada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el acceso a la tabla ruta. " + ex.getMessage());
        }
    }

    //LISTAR RUTAS
    public List<Ruta> listarRutas() {
        List<Ruta> rutas = new ArrayList<>();
        String sql = "SELECT * FROM `ruta` WHERE Estado = 1";

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                rutas.add(new Ruta(rs.getInt("ID_Ruta"), rs.getString("Origen"), rs.getString("Destino"), rs.getTime("Duración_Estimada"), rs.getBoolean("estado")));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el acceso a la tabla ruta. " + ex.getMessage());
        }
        return rutas;
    }

    //BUSCAR UNA RUTA POR ORIGEN O DESTINO (INDIVIDUAL)
    public Ruta buscarRuta(String clasificacion, String nombre) {
        String sql = "SELECT * FROM ruta WHERE Origen LIKE ? AND Estado = 1";
        if (clasificacion.equals("Destino")) {
            sql = "SELECT * FROM ruta WHERE Destino LIKE ? AND Estado = 1";
        }

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre + "%");
            rs = ps.executeQuery();
            if (rs.next()) {
                return new Ruta(rs.getInt("ID_Ruta"), rs.getString("Origen"), rs.getString("Destino"), rs.getTime("Duración_Estimada"), rs.getBoolean("estado"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el acceso a la tabla ruta. " + ex.getMessage());
        }
        return null;
    }
    
    //BUSCAR UNA RUTA POR ORIGEN O DESTINO (LISTA)
    public List<Ruta> buscarRuta_Lista(String clasificacion, String nombre) {
        List<Ruta> rutas = new ArrayList<>();
        
        String sql = "SELECT * FROM ruta WHERE Origen LIKE ? AND Estado = 1";
        if (clasificacion.equals("Destino")) {
            sql = "SELECT * FROM ruta WHERE Destino LIKE ? AND Estado = 1";
        }

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                rutas.add(new Ruta(rs.getInt("ID_Ruta"), rs.getString("Origen"), rs.getString("Destino"), rs.getTime("Duración_Estimada"), rs.getBoolean("estado")));
            }
            ps.close();
            return rutas;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el acceso a la tabla ruta. " + ex.getMessage());
        }
        return null;
    }

    //BUSCAR RUTA POR ID
    public Ruta buscarPorID(int ID_Ruta) {
        String sql = "SELECT * FROM `ruta` WHERE ID_Ruta = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, ID_Ruta);
            rs = ps.executeQuery();
            if (rs.next()) {
                return new Ruta(rs.getInt("ID_Ruta"), rs.getString("Origen"), rs.getString("Destino"), rs.getTime("Duración_Estimada"), rs.getBoolean("Estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe esa ruta");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ruta. " + ex.getMessage());
        }
        return null;
    }
    
    //MODIFICAR RUTA
    public void modificarRuta(Ruta ruta){
        try {
            ps = con.prepareStatement("UPDATE ruta SET Origen = ?, Destino = ?, Duración_Estimada = ? WHERE ID_Ruta = ?", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, ruta.getOrigen());
            ps.setString(2, ruta.getDestino());
            ps.setTime(3, ruta.getDuracionEstimada());
            ps.setInt(4,ruta.getIdRuta());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Ruta modificada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ruta. " + ex.getMessage());
        }
    }
    
    //ELIMINAR RUTA
    public void eliminarRuta(int ID_Ruta){
        try {
            ps = con.prepareStatement("UPDATE ruta SET estado = 0 WHERE ID_Ruta = ?", Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,ID_Ruta);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Ruta eliminada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ruta. " + ex.getMessage());
        }
    }
}
