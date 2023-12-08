package app;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    public static Connection getConexion(){
 
      String url= "jdbc:sqlite:C:/Users/USUARIO/Desktop/PROYECTO CC34/PRF.s3db";
                
        try{
            Connection con = DriverManager.getConnection(url);
            return con;
        } catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
}
    }