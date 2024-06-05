
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
        
        //PasajeroData pasaj = new PasajeroData();
        
        //AGREGAR PASAJERO
//        Pasajero cin = new Pasajero("Cintia", "Andreani", 42697806, "cintia@hotmail.com", "2664750476", true);
//        pasaj.guardar(cin);
        
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


          //DAR DE BAJA PASAJERO
          
          //???
          
          
        //RUTA
        
        RutaData rut = new RutaData();
        
        //AGREGAR RUTA
        rut.agregarRuta(new Ruta("Villa Mercedes", "Carpintería", Time.valueOf(LocalTime.of(3, 00)), true));
        
        
        //LISTA RUTA
        
//        for(Ruta ruta:rut.listarRutas()){
//            System.out.println(ruta);
//        }
        
        //BUSCAR RUTA POR ORIGEN
//   ???    for(Ruta ruta:rut.buscarRuta("Origen", "Villa de Merlo")){
//            System.out.println(ruta);
//        }
        
        //BUSCAR POR DESTINO
//        for(Ruta ruta:rut.buscarRuta("Destino", "San Luis")){
//            System.out.println(ruta);
//        }
        


        
       
        
    }
        
        
    
}