/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;



/**
 *
 * @author nukan
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection c= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/libeary management-1","root","root" );
            return c;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return null;
            
                    
                  
                  
                    
                    
            
        }
        
    }

    static Connection getCon(String jdbcmysqllocalhost3306libreary_management, String root, String root0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
