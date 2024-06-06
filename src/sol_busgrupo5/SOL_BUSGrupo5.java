
package sol_busgrupo5;

import java.sql.*;
import java.time.*;
import sol_busgrupo5.accesoADatos.Conexion;
import sol_busgrupo5.accesoADatos.*;
import sol_busgrupo5.entidades.*;



public class SOL_BUSGrupo5 {

    
    public static void main(String[] args) {
       Connection con = Conexion.getConexion();
        
        
        
        
        
        
        
        
        
        
        //PASAJERO
        
//        PasajeroData pasaj = new PasajeroData();
        
        //AGREGAR PASAJERO
//        Pasajero pablo = new Pasajero("Pablo", "Gonzalez", 41583970, "pablo@hotmail.com", "114769038", true);
//        pasaj.guardar(pablo);
        
        //LISTA PASAJEROS
//        for(Pasajero pasajero:pasaj.listarPasajeros()){
//            System.out.println(pasajero);
//        }

        
         //BUSCAR POR NOMBRE
//         System.out.println(pasaj.buscarNombre("Cintia"));


         //BUSCAR PASAJERO POR APELLIDO
//        System.out.println(pasaj.buscarApellido("Andreani"));

        
        //BUSCAR PASAJERO POR DNI
//        System.out.println(pasaj.buscar(42697806));


          //MODIFICAR PASAJERO
//          pasaj.modificar(new Pasajero(1, "Luciano", "Muzzachiodi", 31201637, "luciano@hotmail.com", "2664307399", true));
          
          //DAR DE BAJA PASAJERO
//            pasaj.eliminar(4);
          

        //RUTA
        
//        RutaData rut = new RutaData();
        
        //AGREGAR RUTA
//        rut.agregarRuta(new Ruta("Villa Mercedes", "Carpintería", Time.valueOf(LocalTime.of(3, 00)), true));
        
        
        //LISTA RUTA
//        for(Ruta ruta:rut.listarRutas()){
//            System.out.println(ruta);
//        }
        
        //BUSCAR RUTA POR ORIGEN
//        for(Ruta ruta:rut.buscarRuta("Origen", "Villa de Merlo")){
//            System.out.println(ruta);
//        }
        
        //BUSCAR POR DESTINO
//        for(Ruta ruta:rut.buscarRuta("Destino", "San Luis")){
//            System.out.println(ruta);
//        }

        //DAR DE BAJA RUTA
//         rut.modificarRuta(1);


        //PASAJE
        
//        ColectivoData colectivo = new ColectivoData();
//        PasajeData pasaje = new PasajeData();
        
        //REGISTRAR VENTA
//    ???    pasaje.registrarVenta(new Pasaje(pasaj.buscar(31201637), colectivo.buscar(1),rut.buscarPorID(11), Date.valueOf(LocalDate.of(2024, 6, 26)), Time.valueOf("17:50:00"), 24, 7000, true));
        

        //LISTAR PASAJE POR RUTA
//   ???     for(Pasaje pas:pasaje.visualizarPorRuta(11)){
//            System.out.println(pas);
//        }
        
//        //LISTAR PASAJES POR HORARIO
//    ???    for(Pasaje pas:pasaje.visualizarPorHorario(Time.valueOf("00:00:17"))){
//            System.out.println(pas);
//        }

        
        //COLECTIVO
        
//        ColectivoData cole = new ColectivoData();
        
        //BUSCAR COLECTIVO
        //System.out.println(cole.buscar(1));
        
        
        //LISTAR COLECTIVO
//        for(Colectivo colec: cole.listarColectivos()){
//            System.out.println(colec);
//        }
        
    }  
    
}