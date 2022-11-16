
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;
/**
 *
 * @author sahilgupta2317
 */
public class ConnectionProvider {
    
   public Connection con;
    
    public static Connection getCon()
    {
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Project","root","78767248jMt2@");
        return con;
        
        }catch(Exception e)
        {
            return null;
        }
}
}
