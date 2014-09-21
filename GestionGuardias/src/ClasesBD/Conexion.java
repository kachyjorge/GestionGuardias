/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasesBD;

import java.sql.*;

/**
 *
 * @author kachy
 */
public class Conexion {
    /**Connection conexion; 
    Statement sentencia;
    ResultSet rsDatos;
    PreparedStatement psPrepSencencias;
    **/
    
   
    public static Connection Cadena() throws ClassNotFoundException, SQLException
    {
        // Esta Función Establece la Conexion
      //  try {
            Class.forName("com.mysql.jdbc.Driver"); 
            String conStr = "jdbc:mysql://localhost:3306/guardia_hospital?zeroDateTimeBehavior=convertToNull";
                            
            Connection cn=DriverManager.getConnection(conStr, "root", "root");
            /**conexion.setAutoCommit(false); /* si no especifican esto el autocommit 
                                           es por defecto true entonces no es necesario
                                           hacer los commit despues de las insersiones,
                                           eliminaciones o modificaciones*/
            //sentencia=conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            
            return cn; 
    }
}


