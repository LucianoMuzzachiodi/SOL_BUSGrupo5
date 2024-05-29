
package sol_busgrupo5.accesoADatos;

import java.sql.*;


public class PasajeData {
    private Connection con;

    public PasajeData() {
         con = Conexion.getConexion();
    }
    
    
}
