package sol_busgrupo5.accesoADatos;

import java.sql.*;
import java.util.*;
import java.sql.Date;
import javax.swing.JOptionPane;
import sol_busgrupo5.entidades.*;

public class PasajeData {
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

    public PasajeData() {
         con = Conexion.getConexion();
    }
    
    public void registrarVenta(Pasaje pasaje){
        String sql = "INSERT INTO `pasaje`(`ID_Pasajero`, `ID_Colectivo`, `ID_Ruta`, `Fecha_Viaje`, `Hora_Viaje`, `Asiento`, `Precio`) "
                + "VALUES (?,?,?,?,?,?,?)";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, pasaje.getPasajero().getIdPasajero());
            ps.setInt(2, pasaje.getColectivo().getIdColectivo());
            ps.setInt(3, pasaje.getRuta().getIdRuta());
            ps.setDate(4, (Date) pasaje.getFechaViaje());
            ps.setDate(5, (Date) pasaje.getHoraViaje());
            ps.setInt(6, pasaje.getAsiento());
            ps.setDouble(7, pasaje.getPrecio());
            ps.executeUpdate();
            
            rs = ps.getGeneratedKeys();
            if(rs.next()){
                pasaje.setIdPasaje(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Pasaje registrado");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en el acceso a la tabla pasaje");
        }
    }
    public List<Pasaje> visualizarPorRuta(int ID_Ruta){
        List<Pasaje> pasajes = new ArrayList<>();
        RutaData RD = new RutaData();
        
        String sql = "SELECT * FROM pasaje WHERE ID_Ruta = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, ID_Ruta);
            rs = ps.executeQuery();
            while (rs.next()) {
                Pasaje pasaje = new Pasaje();
                pasaje.getPasajero().setIdPasajero(rs.getInt("ID_Pasajero"));
                pasaje.getColectivo().setIdColectivo(rs.getInt("ID_Colectivo"));
                pasaje.setRuta(RD.buscarPorID(ID_Ruta));
                pasaje.setFechaViaje(rs.getDate("Fecha_Viaje"));
                pasaje.setHoraViaje(rs.getDate("Hora_Viaje"));
                pasaje.setAsiento(rs.getInt("Asiento"));
                pasaje.setPrecio(rs.getDouble("Precio"));
                pasajes.add(pasaje);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en el acceso a la tabla pasaje");
        }
        return pasajes;
    }
    public List<Pasaje> visualizarPorHorario(Date fechaViaje){
        List<Pasaje> pasajes = new ArrayList<>();
        String sql = "SELECT * FROM pasaje WHERE Fecha_Viaje = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setDate(1, fechaViaje);
            rs = ps.executeQuery();
            while (rs.next()) {
                Pasaje pasaje = new Pasaje();
                pasaje.getPasajero().setIdPasajero(rs.getInt("ID_Pasajero"));
                pasaje.getColectivo().setIdColectivo(rs.getInt("ID_Colectivo"));
                pasaje.getRuta().setIdRuta(rs.getInt("ID_Ruta"));
                pasaje.setFechaViaje(rs.getDate("Fecha_Viaje"));
                pasaje.setHoraViaje(rs.getDate("Hora_Viaje"));
                pasaje.setAsiento(rs.getInt("Asiento"));
                pasaje.setPrecio(rs.getDouble("Precio"));
                pasajes.add(pasaje);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en el acceso a la tabla pasaje");
        }
        return pasajes;
    }
    public List<Pasaje> visualizarPorPasajero(int ID_Pasajero){
        List<Pasaje> pasajes = new ArrayList<>();
        String sql = "SELECT * FROM pasaje WHERE ID_Pasajero = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, ID_Pasajero);
            rs = ps.executeQuery();
            while (rs.next()) {
                Pasaje pasaje = new Pasaje();
                pasaje.getPasajero().setIdPasajero(rs.getInt("ID_Pasajero"));
                pasaje.getColectivo().setIdColectivo(rs.getInt("ID_Colectivo"));
                pasaje.getRuta().setIdRuta(rs.getInt("ID_Ruta"));
                pasaje.setFechaViaje(rs.getDate("Fecha_Viaje"));
                pasaje.setHoraViaje(rs.getDate("Hora_Viaje"));
                pasaje.setAsiento(rs.getInt("Asiento"));
                pasaje.setPrecio(rs.getDouble("Precio"));
                pasajes.add(pasaje);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en el acceso a la tabla pasaje");
        }
        return pasajes;
    }
    public void eliminarPasaje(int ID_Pasajero, int ID_Colectivo, int ID_Ruta){
        String sql = "UPDATE pasaje SET estado = 0 WHERE ID_Pasajero = ? AND ID_Colectivo = ? AND ID_Ruta = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, ID_Pasajero);
            ps.setInt(2, ID_Colectivo);
            ps.setInt(3, ID_Ruta);
            rs = ps.executeQuery();
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en el acceso a la tabla pasaje");
        }
    }
}
