
package sol_busgrupo5.accesoADatos;

import java.sql.*;


public class PasajeroData {
    private Connection con;

    public PasajeroData() {
         con = Conexion.getConexion();
    }
    
    
}
