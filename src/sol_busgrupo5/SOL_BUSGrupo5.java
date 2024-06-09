
package sol_busgrupo5;

import java.sql.*;
import java.time.*;
import sol_busgrupo5.accesoADatos.Conexion;
import sol_busgrupo5.accesoADatos.*;
import sol_busgrupo5.entidades.*;



public class SOL_BUSGrupo5 {

    
    public static void main(String[] args) {
       Connection con = Conexion.getConexion();
        
        HorarioData horaD = new HorarioData();
        PasajeroData pasajeroD = new PasajeroData();
        PasajeData pasajeD = new PasajeData();
        RutaData rutaD = new RutaData();
        ColectivoData colectivoD = new ColectivoData();
        
        
//----------------------------------------------------------------------------------------------------------------------       
        //PASAJERO
        
        
        //AGREGAR PASAJERO
//        Pasajero pablo = new Pasajero("Pablo", "Gonzalez", 41583970, "pablo@hotmail.com", "114769038", true);
//        pasajeroD.guardar(pablo);
        
        //LISTA PASAJEROS
//        for(Pasajero pasajero:pasajeroD.listarPasajeros()){
//            System.out.println(pasajero);
//        }

         //BUSCAR POR NOMBRE
//         System.out.println(pasajeroD.buscarNombre("Cintia"));

         //BUSCAR PASAJERO POR APELLIDO
//        System.out.println(pasajeroD.buscarApellido("Andreani"));

        //BUSCAR PASAJERO POR DNI
//        System.out.println(pasajeroD.buscar(42697806));

          //MODIFICAR PASAJERO
//          pasajeroD.modificar(new Pasajero(1, "Luciano", "Muzzachiodi", 31201637, "luciano@hotmail.com", "2664307390", true));
          
          //DAR DE BAJA PASAJERO
//            pasajeroD.eliminar(7);
        

//----------------------------------------------------------------------------------------------------------------------
        //RUTA
        
        
        //AGREGAR RUTA
//        rutaD.agregarRuta(new Ruta("Villa Mercedes", "Carpintería", Time.valueOf(LocalTime.of(3, 00)), true));
        
        //LISTA RUTA
//        for(Ruta ruta:rutaD.listarRutas()){
//            System.out.println(ruta);
//        }
        
        //BUSCAR RUTA POR ORIGEN
//        for(Ruta ruta:rutaD.buscarRuta_Lista("Origen", "Villa de Merlo")){
//            System.out.println(ruta);
//        }
        
        //BUSCAR POR DESTINO
//        for(Ruta ruta:rutaD.buscarRuta_Lista("Destino", "San Luis")){
//            System.out.println(ruta);
//        }

      //DAR DE BAJA RUTA
//         rutaD.eliminarRuta(1);


//----------------------------------------------------------------------------------------------------------------------
        //PASAJE
             
        //REGISTRAR VENTA
//        Pasajero pasajero = pasajeroD.buscar(31201637);
//        Colectivo colectivo = colectivoD.buscar(1);
//        Ruta ruta = rutaD.buscarPorID(11);
//        Pasaje pasaje = new Pasaje(pasajero, colectivo, ruta, Date.valueOf(LocalDate.of(2024, 6, 26)), Time.valueOf("17:50:00"), 25, 7000, true);
//        pasajeD.registrarVenta(pasaje);
        
        //LISTAR PASAJE POR RUTA
//        for(Pasaje pas:pasajeD.visualizarPorRuta(11)){
//            System.out.println(pas);
//        }
        
//        //LISTAR PASAJES POR HORARIO
//    ?????      for(Pasaje pas:pasajeD.visualizarPorHorario(Time.valueOf("17:50:00"))){
//            System.out.println(pas);
//        }


//----------------------------------------------------------------------------------------------------------------------        
        //COLECTIVO
        
        
        //BUSCAR COLECTIVO
//        System.out.println(colectivoD.buscar(1));
        
        //LISTAR COLECTIVO
//        for(Colectivo colec: colectivoD.listarColectivos()){
//            System.out.println(colec);
//        }
        

//----------------------------------------------------------------------------------------------------------------------
        //HORARIO
             
 
        //AGREGAR HORARIO
//        horaD.Añadir_Horario(new Horario(rutaD.buscarPorID(1), Time.valueOf("10:00:00"), Time.valueOf("13:00:00"), true));

        //LISTAR HORARIOS
//           System.out.println("              Por ruta(con la ID 1):");
//           for(Horario horario:horaD.Listar_Horarios("Por ruta", 1, null)){
//               System.out.println(horario);
//           }
//           System.out.println("");
//           System.out.println("              Por Fecha(Muestra todos los horarios disponibles):");
//           for(Horario horario:horaD.Listar_Horarios("Por Fecha", 0, Time.valueOf("04:00:00"))){
//               System.out.println(horario);
//           }
    }  
}
    