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
    private PasajeroData pasajeroData = new PasajeroData();
    private ColectivoData colectivoData = new ColectivoData();
    RutaData rutaData = new RutaData();

    public PasajeData() {
        con = Conexion.getConexion();
    }

    //GUARDAR UN PASAJE
    public int registrarVenta(Pasaje pasaje) {
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO `pasaje`(`ID_Pasaje`, `ID_Pasajero`, `ID_Colectivo`, `ID_Ruta`, `Fecha_Viaje`, `Hora_Viaje`, `Asiento`, `Precio`, `Estado`) VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setInt(1, pasaje.getPasajero().getIdPasajero());
            ps.setInt(2, pasaje.getColectivo().getIdColectivo());
            ps.setInt(3, pasaje.getRuta().getIdRuta());
            ps.setDate(4, (Date) pasaje.getFechaViaje());
            ps.setTime(5, pasaje.getHoraViaje());
            ps.setInt(6, pasaje.getAsiento());
            ps.setDouble(7, pasaje.getPrecio());
            ps.setBoolean(8, true);
            return ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println(ex.fillInStackTrace());
            JOptionPane.showMessageDialog(null, "Error en el acceso a la tabla pasaje. " + ex.getMessage());
        } catch (NullPointerException NPE) {
            System.err.println(NPE);
        } finally {
            try {
                if (ps != null) {ps.close();}
                if (rs != null) {rs.close();}
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al cerrar. " + ex.getMessage());
            }
        }
        return 0;
    }

    //VER PASAJES (ACTIVOS)
    public List<Pasaje> visualizarPasajes() {
        List<Pasaje> pasajes = new ArrayList<>();
        String sql = "SELECT * FROM pasaje WHERE Estado = 1";
        PasajeroData pasajeroData = new PasajeroData();
        
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Ruta AUX_Ruta = new Ruta();
                Pasajero AUX_Pasajero = new Pasajero();
                Colectivo colectivos = new Colectivo();
                for (Colectivo colectivo : colectivoData.listarColectivos()) {
                    if (rs.getInt("ID_Colectivo") == colectivo.getIdColectivo()) {
                        colectivos = colectivo;
                    }
                }
                for (Pasajero pasajeros : pasajeroData.listarPasajeros()) {
                    if (rs.getInt("ID_Pasajero") == pasajeros.getIdPasajero()) {
                        AUX_Pasajero = pasajeros;
                    }
                }
                for (Ruta ruta : rutaData.listarRutas()) {
                    if (ruta.getIdRuta() == rs.getInt("ID_Ruta")) {
                        AUX_Ruta = ruta;
                    }
                }
                Pasaje pasaje = new Pasaje(rs.getInt("ID_Pasaje"), AUX_Pasajero, colectivos,AUX_Ruta, rs.getDate("Fecha_Viaje"), rs.getTime("Hora_Viaje"), rs.getInt("Asiento"), rs.getDouble("Precio"), rs.getBoolean("Estado"));
                pasajes.add(pasaje);
            }
            return pasajes;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el acceso a la tabla pasaje." + ex.getMessage());
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }finally {
            try {
                if (ps != null) {ps.close();}
                if (rs != null) {rs.close();}
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al cerrar. " + ex.getMessage());
            }
        }
        return null;
    }

    //VER PASAJES POR RUTA
    public List<Pasaje> visualizarPorRuta(int ID_Ruta) {
        List<Pasaje> pasajes = new ArrayList<>();
        PasajeroData pasaj = new PasajeroData();
        String sql = "SELECT * FROM pasaje WHERE pasaje.ID_Ruta = ? AND Estado = 1";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, ID_Ruta);
            rs = ps.executeQuery();

            while (rs.next()) {
                Pasajero AUX_Pasajero = new Pasajero();
                Colectivo colectivos = new Colectivo();
                for (Colectivo colectivo : colectivoData.listarColectivos()) {
                    if (rs.getInt("ID_Colectivo") == colectivo.getIdColectivo()) {
                        colectivos = colectivo;
                    }
                }
                for (Pasajero pasajeroos : pasaj.listarPasajeros()) {
                    if (rs.getInt("ID_Pasajero") == pasajeroos.getIdPasajero()) {
                        AUX_Pasajero = pasajeroos;
                    }
                }
                Pasaje pasaje = new Pasaje(rs.getInt("ID_Pasaje"), AUX_Pasajero, colectivos, rutaData.buscarPorID(ID_Ruta), rs.getDate("Fecha_Viaje"), rs.getTime("Hora_Viaje"), rs.getInt("Asiento"), rs.getDouble("Precio"), rs.getBoolean("Estado"));
                pasajes.add(pasaje);
            }
            return pasajes;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el acceso a la tabla pasaje." + ex.getMessage());
        } finally {
            try {
                if (ps != null) {ps.close();}
                if (rs != null) {rs.close();}
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al cerrar. " + ex.getMessage());
            }
        }
        return null;
    }

    //VER PASAJES SEGÚN UN HORARIO
    public List<Pasaje> visualizarPorHorario(Time horaViaje) {
        List<Pasaje> pasajes = new ArrayList<>();
        String sql = "SELECT * FROM pasaje WHERE Hora_viaje >= ? AND Estado = 1";

        try {
            ps = con.prepareStatement(sql);
            ps.setTime(1, horaViaje);
            rs = ps.executeQuery();
            PasajeroData pasaj = new PasajeroData();
            ColectivoData colectivoData = new ColectivoData();
            while (rs.next()) {
                Pasajero AUX_Pasajero = new Pasajero();
                Colectivo colectivos = new Colectivo();
                Ruta ruta = new Ruta();
                for (Colectivo colectivo : colectivoData.listarColectivos()) {
                    if (rs.getInt("ID_Colectivo") == colectivo.getIdColectivo()) {
                        colectivos = colectivo;
                    }
                }
                for (Pasajero pasajeros : pasaj.listarPasajeros()) {
                    if (rs.getInt("ID_Pasajero") == pasajeros.getIdPasajero()) {
                        AUX_Pasajero = pasajeros;
                    }
                }
                for (Ruta rutas : rutaData.listarRutas()) {
                    if (rs.getInt("ID_Ruta") == rutas.getIdRuta()) {
                        ruta = rutas;
                    }
                }
                Pasaje pasaje = new Pasaje(rs.getInt("ID_Pasaje"), AUX_Pasajero, colectivos, ruta, rs.getDate("Fecha_Viaje"), rs.getTime("Hora_Viaje"), rs.getInt("Asiento"), rs.getDouble("Precio"), rs.getBoolean("Estado"));
                pasajes.add(pasaje);
            }
            return pasajes;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el acceso a la tabla pasaje." + ex.getMessage());
        } finally {
            try {
                if (ps != null) {ps.close();}
                if (rs != null) {rs.close();}
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al cerrar. " + ex.getMessage());
            }
        }
        return null;
    }

    //VER PASAJES
    public List<Pasaje> visualizarPorPasajero(int ID_Pasajero) {
        List<Pasaje> pasajes = new ArrayList<>();
        String sql = "SELECT * FROM pasaje WHERE ID_Pasajero = ? AND Estado = 1";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, ID_Pasajero);
            rs = ps.executeQuery();
            while (rs.next()) {
                Pasaje pasaje = new Pasaje(rs.getInt("ID_Pasaje"), pasajeroData.buscar("ID", (Object) rs.getInt("ID_Pasajero")), colectivoData.buscar(rs.getInt("ID_Colectivo")), rutaData.buscarPorID(rs.getInt("ID_Ruta")), rs.getDate("Fecha_Viaje"), rs.getTime("Hora_Viaje"), rs.getInt("Asiento"), rs.getDouble("Precio"), rs.getBoolean("Estado"));
                pasajes.add(pasaje);
            }
            return pasajes;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el acceso a la tabla pasaje." + ex.getMessage());
        } finally {
            try {
                if (ps != null) {ps.close();}
                if (rs != null) {rs.close();}
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al cerrar. " + ex.getMessage());
            }
        }
        return null;
    }

    //MODIFICAR UN PASAJE
    public void modificar(Pasaje pasaje) {
        String sql = "UPDATE pasaje SET ID_Colectivo = ?, ID_Ruta = ?, Fecha_Viaje = ?, Hora_Viaje = ?, Asiento = ?, Precio = ? WHERE ID_Pasajero = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, pasaje.getColectivo().getIdColectivo());
            ps.setInt(2, pasaje.getRuta().getIdRuta());
            ps.setDate(3, (Date) pasaje.getFechaViaje());
            ps.setTime(4, (Time) pasaje.getHoraViaje());
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

    //ELIMINAR UN PASAJE
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

    //BUSCAR UN ASIENTO DISPONIBLE
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
