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

    public void registrarVenta(Pasaje pasaje) {
        String sql = "INSERT INTO pasaje (ID_Pasajero, ID_Colectivo, ID_Ruta, Fecha_Viaje, Hora_Viaje, Asiento, Precio, Estado) VALUES (?,?,?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, pasaje.getPasajero().getIdPasajero());
            ps.setInt(2, pasaje.getColectivo().getIdColectivo());
            ps.setInt(3, pasaje.getRuta().getIdRuta());
            ps.setDate(4, new java.sql.Date(pasaje.getFechaViaje().getTime()));
            ps.setTime(5, new java.sql.Time(pasaje.getHoraViaje().getTime()));
            ps.setInt(6, buscarAsientoDisponible(pasaje.getAsiento()));
            ps.setDouble(7, pasaje.getPrecio());
            ps.setBoolean(8, pasaje.isEstado());
            ps.executeUpdate();

            rs = ps.getGeneratedKeys();
            if (rs.next()) {
                pasaje.setIdPasaje(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Pasaje registrado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el acceso a la tabla pasaje. " + ex.getMessage());
        }
    }
    
    public List<Pasaje> visualizarPasajes() {
        List<Pasaje> pasajes = new ArrayList<>();

        String sql = "SELECT * FROM pasaje";

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Pasaje pasaje = new Pasaje();
                pasaje.getPasajero().setIdPasajero(rs.getInt("ID_Pasajero"));
                pasaje.getColectivo().setIdColectivo(rs.getInt("ID_Colectivo"));
                pasaje.getRuta().setIdRuta(rs.getInt("ID_Ruta"));
                pasaje.setFechaViaje(rs.getDate("Fecha_Viaje"));
                pasaje.setHoraViaje(rs.getTime("Hora_Viaje"));
                pasaje.setAsiento(rs.getInt("Asiento"));
                pasaje.setPrecio(rs.getDouble("Precio"));
                pasajes.add(pasaje);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el acceso a la tabla pasaje." + ex.getMessage());
        }
        return pasajes;
    }

    public List<Pasaje> visualizarPorRuta(int ID_Ruta) {
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
                pasaje.setHoraViaje(rs.getTime("Hora_Viaje"));
                pasaje.setAsiento(rs.getInt("Asiento"));
                pasaje.setPrecio(rs.getDouble("Precio"));
                pasajes.add(pasaje);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el acceso a la tabla pasaje." + ex.getMessage());
        }
        return pasajes;
    }

    public List<Pasaje> visualizarPorHorario(Time horaViaje) {
        List<Pasaje> pasajes = new ArrayList<>();
        String sql = "SELECT * FROM pasaje WHERE Hora_viaje = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setTime(1, horaViaje);
            rs = ps.executeQuery();
            while (rs.next()) {
                Pasaje pasaje = new Pasaje();
                pasaje.getPasajero().setIdPasajero(rs.getInt("ID_Pasajero"));
                pasaje.getColectivo().setIdColectivo(rs.getInt("ID_Colectivo"));
                pasaje.getRuta().setIdRuta(rs.getInt("ID_Ruta"));
                pasaje.setFechaViaje(rs.getDate("Fecha_Viaje"));
                pasaje.setHoraViaje(rs.getTime("Hora_Viaje"));
                pasaje.setAsiento(rs.getInt("Asiento"));
                pasaje.setPrecio(rs.getDouble("Precio"));
                pasajes.add(pasaje);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el acceso a la tabla pasaje." + ex.getMessage());
        }
        return pasajes;
    }

    public List<Pasaje> visualizarPorPasajero(int ID_Pasajero) {
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
                pasaje.setHoraViaje(rs.getTime("Hora_Viaje"));
                pasaje.setAsiento(rs.getInt("Asiento"));
                pasaje.setPrecio(rs.getDouble("Precio"));
                pasajes.add(pasaje);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el acceso a la tabla pasaje." + ex.getMessage());
        }
        return pasajes;
    }
    
    public void modificar(Pasaje pasaje) {
        String sql = "UPDATE pasaje SET ID_Colectivo = ?, ID_Ruta = ?, Fecha_Viaje = ?, Hora_Viaje = ?, Asiento = ?, Precio = ? WHERE ID_Pasajero = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, pasaje.getColectivo().getIdColectivo());
            ps.setInt(2, pasaje.getRuta().getIdRuta());
            ps.setDate(3, (Date)pasaje.getFechaViaje());
            ps.setTime(4, (Time)pasaje.getHoraViaje());
            ps.setInt(5, pasaje.getAsiento());
            ps.setDouble(6, pasaje.getPrecio());
            ps.setInt(7, pasaje.getIdPasaje());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Pasaje modificado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasaje. " + ex.getMessage());
        }
    }

    public void eliminarPasaje(int ID_Pasajero, int ID_Colectivo, int ID_Ruta) {
        String sql = "UPDATE pasaje SET estado = 0 WHERE ID_Pasajero = ? AND ID_Colectivo = ? AND ID_Ruta = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, ID_Pasajero);
            ps.setInt(2, ID_Colectivo);
            ps.setInt(3, ID_Ruta);
            rs = ps.executeQuery();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el acceso a la tabla pasaje." + ex.getMessage());
        }
    }
    
    public int buscarAsientoDisponible(int asiento) {
        try {
            ps = con.prepareStatement("SELECT Asiento FROM pasaje WHERE Asiento = ?");
            ps.setInt(1, asiento);
            rs = ps.executeQuery();
            if (rs.next() && asiento > 0 && asiento <= 100) {
                return buscarAsientoDisponible(asiento + 1);
            } else if (asiento > 100) {
                JOptionPane.showMessageDialog(null, "No quedan asientos.");
                return 0;
            } else {
                return asiento;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el acceso a la tabla pasaje. " + ex.getMessage());
            return 0;
        } finally {
            try {
                if (ps != null) {ps.close();}
                if (rs != null) {rs.close();}
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al cerrar. " + ex.getMessage());
            }
        }
    }
}
