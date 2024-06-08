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

    public List<Ruta> listarRutas() {
        List<Ruta> rutas = new ArrayList<>();
        String sql = "SELECT * FROM `ruta` WHERE Estado = true";

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

    public Ruta buscarRuta(String decision, String nombre) {
        String sql = "SELECT * FROM ruta WHERE Origen LIKE ?";
        if (decision.equals("Destino")) {
            sql = "SELECT * FROM ruta WHERE Destino LIKE ?";
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
    
    public List<Ruta> buscarRuta_Lista(String decision, String nombre) {
        List<Ruta> rutas = new ArrayList<>();
        
        String sql = "SELECT * FROM ruta WHERE Origen LIKE ?";
        if (decision.equals("Destino")) {
            sql = "SELECT * FROM ruta WHERE Destino LIKE ?";
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

    public Ruta buscarPorID(int ID_Ruta) {
        String sql = "SELECT * FROM `ruta` WHERE ID_Ruta LIKE ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ID_Ruta + "%");
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
