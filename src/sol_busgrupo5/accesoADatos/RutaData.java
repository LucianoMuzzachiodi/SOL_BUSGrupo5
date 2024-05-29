
package sol_busgrupo5.accesoADatos;

import java.sql.*;


public class RutaData {
    private Connection con;

    public RutaData() {
         con = Conexion.getConexion();
    }
    
    
}
