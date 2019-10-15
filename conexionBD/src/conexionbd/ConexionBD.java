
package conexionbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Juan Pablo
 */
public class ConexionBD {

    
    public static void main(String[] args) {
        try {
            // TODO code application logic here

            Connection cnx = DriverManager.getConnection("jdbc:mysql://localhost/ejemplo2", "root", "");
            System.out.println("Conexion exitosa!!");
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
