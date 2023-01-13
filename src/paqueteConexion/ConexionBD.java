
package paqueteConexion;

import java.sql.*;




public class ConexionBD {
    
    Connection cn;
    Statement st;
    
    String bd="naveespacial";
    String url="jdbc:mysql://localhost:3306/";
    String user="root";
    String password="";
    String driver="com.mysql.cj.jdbc.Driver";
    
    
   
    public Connection conexion(){
        
        try {
            Class.forName(driver);
            cn=DriverManager.getConnection(url+bd,user, password);
            System.out.println("Se conectó a base de datos " + bd);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            
           
        }
        return cn;
           
    }
    Statement createStatement(){
        throw new UnsupportedOperationException("No soportado");
        
        
        
    }

    
    
}
