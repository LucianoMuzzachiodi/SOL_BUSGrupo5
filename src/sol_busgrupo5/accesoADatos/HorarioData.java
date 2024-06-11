package sol_busgrupo5.accesoADatos;

import java.sql.*;
import java.util.ArrayList;
import sol_busgrupo5.entidades.Horario;
import sol_busgrupo5.entidades.Ruta;

public class HorarioData {
    private Connection con;
    RutaData RD = new RutaData();
    
    public HorarioData() {
        con = Conexion.getConexion();
    }
    
    //AÑADIR UN HORARIO
    public int Añadir_Horario(Horario horario){
        try{
            PreparedStatement PS = con.prepareStatement("INSERT INTO `horario` (`ID_Horario`, `ID_Ruta`, `Hora_Salida`, `Hora_Llegada`,`estado` ) VALUES (NULL, ?, ?, ?, ?)");
            PS.setInt(1, horario.getRuta().getIdRuta());
            PS.setTime(2, Time.valueOf((String.valueOf(horario.getHoraSalida()))));
            PS.setTime(3, Time.valueOf((String.valueOf(horario.getHoraLlegada()))));
            PS.setBoolean(4,true);
//            PS.close();
            return PS.executeUpdate();
        }catch(SQLException SQLE){
            System.err.println(SQLE);
        }
        return 0;
    }
    
    //LISTAR HORARIOS
    public ArrayList<Horario> Listar_Horarios(String Condicional, int ID_Ruta, Time time){
        ArrayList<Horario> horarios = new ArrayList();
        try{
            if(Condicional.equals("Por ruta")){
                PreparedStatement PS = con.prepareStatement("SELECT horario.ID_Horario,horario.ID_Ruta,horario.Hora_Salida,horario.Hora_Llegada,horario.Estado FROM `horario`,`ruta` WHERE horario.ID_Ruta = "+ID_Ruta+" AND ruta.ID_Ruta = horario.ID_Ruta AND ruta.Estado = true");
                ResultSet RS = PS.executeQuery();
                Ruta ID = new Ruta();
                for(Ruta ruti:RD.listarRutas()){
                    if(ruti.getIdRuta()==ID_Ruta) ID=ruti;
                }
                while(RS.next()){
                    Horario horario = new Horario(RS.getInt("ID_Horario"),ID,RS.getTime("Hora_Salida"),RS.getTime("Hora_Llegada"),RS.getBoolean("Estado"));
                    horarios.add(horario);
                }
                return horarios;
            } else if (Condicional.equals("Por Fecha")){
                PreparedStatement PS = con.prepareStatement("SELECT * FROM `horario`,`ruta` WHERE horario.Hora_Salida >= \""+time+"\""+" AND ruta.ID_Ruta = horario.ID_Ruta AND ruta.Estado = true");
                ResultSet RS = PS.executeQuery();
                
                while(RS.next()){
                    Ruta ID = new Ruta();
                    for(Ruta ruti:RD.listarRutas()){
                        if(ruti.getIdRuta()==RS.getInt("ID_Ruta")) ID=ruti;
                        
                    }
                    Horario horario = new Horario(RS.getInt("ID_Horario"),ID,RS.getTime("Hora_Salida"),RS.getTime("Hora_Llegada"),RS.getBoolean("estado"));
                    horarios.add(horario);
                }
                return horarios;
            } else if (Condicional.equals("Listar fecha")){
                PreparedStatement PS = con.prepareStatement("SELECT * FROM `horario`");
                ResultSet RS = PS.executeQuery();
                
                while(RS.next()){
                    Ruta ID = new Ruta();
                    for(Ruta ruti:RD.listarRutas()){
                        if(ruti.getIdRuta()==RS.getInt("ID_Ruta")) ID=ruti;
                        
                    }
                    Horario horario = new Horario(RS.getInt("ID_Horario"),ID,RS.getTime("Hora_Salida"),RS.getTime("Hora_Llegada"),RS.getBoolean("estado"));
                    horarios.add(horario);
                }
                return horarios;
            }
        }catch(SQLException SQLE){
            System.err.println("error en el codigo: "+SQLE);
        }catch(NullPointerException N){
            System.out.println(N);
        }
        return null;
    }
}
