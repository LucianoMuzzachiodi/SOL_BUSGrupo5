package sol_busgrupo5.accesoADatos;

import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import sol_busgrupo5.entidades.*;

public class ColectivoData {
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

    public ColectivoData() {
        con = Conexion.getConexion();
    }
    
    //BUSCAR POR ID
    public Colectivo buscar(int ID_Colectivo) {
        String sql = "SELECT * FROM `colectivo` WHERE ID_Colectivo = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, ID_Colectivo);
            rs = ps.executeQuery();
            if (rs.next()) {
                return new Colectivo(rs.getInt("ID_Colectivo"),rs.getString("Matrícula"),rs.getString("Marca"),rs.getString("Modelo"),rs.getInt("Capacidad"),rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe ese Colectivo");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla colectivo" + ex);
        }
        return null;
    }
    
    // LISTAR COLECTIVOS
    public List<Colectivo> listarColectivos(){
        List<Colectivo> colectivos = new ArrayList<>();
        
        try {
            ps = con.prepareStatement("SELECT * FROM colectivo WHERE estado = 1");
            rs = ps.executeQuery();
            while (rs.next()) {
                colectivos.add(new Colectivo(rs.getInt("ID_Colectivo"),rs.getString("Matrícula"),rs.getString("Marca"),rs.getString("Modelo"),rs.getInt("Capacidad"),rs.getBoolean("estado")));
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en el acceso a la tabla colectivo");
        }
        return colectivos;
    }
}
