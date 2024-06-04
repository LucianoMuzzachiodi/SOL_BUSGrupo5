
package sol_busgrupo5;

import java.sql.*;
import sol_busgrupo5.accesoADatos.Conexion;
import sol_busgrupo5.accesoADatos.*;
import sol_busgrupo5.entidades.*;



public class SOL_BUSGrupo5 {

    
    public static void main(String[] args) {
        Connection con = Conexion.getConexion();
        
        PasajeroData pasaj = new PasajeroData();
        
        
        
        //AGREGAR PASAJERO
//        Pasajero cin = new Pasajero("Cintia", "Andreani", 42697806, "cintia@hotmail.com", "2664750476");
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
        
        
       
        
    }
    
}