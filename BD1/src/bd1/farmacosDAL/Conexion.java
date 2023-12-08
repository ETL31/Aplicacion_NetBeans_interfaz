/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd1.farmacosDAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



/**
 *
 * @author Victor Guzman
 */
public class Conexion {
    String strConexionDB= "jdbc:sqlite:F:/SQL/SQL/PRF.s3db";
    Connection conn= null;
    
    public Conexion (){
        try{
            Class.forName("org.sqlite.JDBC");
             conn= DriverManager.getConnection(strConexionDB);  
             
             System.out.println("Conexion Exitosa");
                     
             
        }catch(Exception e){
            
            System.out.println("Error en Conexion" +e);
            
            
        }
        
    }
    
    public int ejecutarSentenciaSQL( String strSentenciaSQL){
    
        try {
        PreparedStatement pstm= conn.prepareStatement(strSentenciaSQL);
        pstm.execute();
        return 1;
        }catch(SQLException e){
            System.out.println(e);
            return 0;
        }
    }
        public ResultSet consultarRegistros(String strSentenciaSQL){
        
        try{
        PreparedStatement pstm= conn.prepareStatement(strSentenciaSQL);
        ResultSet respuesta= pstm.executeQuery();
        return respuesta;
        
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
        }
        
}
    

