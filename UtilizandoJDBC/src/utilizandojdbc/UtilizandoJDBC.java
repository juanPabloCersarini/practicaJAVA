/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilizandojdbc;

import java.sql.*;

/**
 *
 * @author Juan Pablo
 */
public class UtilizandoJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String base = "ejemplo2";
        String url = "jdbc:mysql://localhost:3306/"+base;
        String user = "root";
        String password="";
        
        
        try{
            
            Connection miConexion = DriverManager.getConnection(url, user, password);
            Statement miStatment = miConexion.createStatement();
             
            
            miStatment.executeUpdate("INSERT INTO clientes (nCli, aCli,dirCli,telCli) values ('Rodrigo','Marquez','lascano 4040','451-451')"); // executeQuery();
            ResultSet miRSet = miStatment.executeQuery("select * from clientes");
            
            System.out.println("Nombre: --- Apellido");
            while(miRSet.next()){
                System.out.println(miRSet.getString("nCli") + " " + miRSet.getString("aCli") + " " + miRSet.getString("dirCli"));
                
            }
            
            
        }catch (SQLException e){
            
            System.out.println("error en conexion!");
            System.out.println(e);
        }
    }
    
}
