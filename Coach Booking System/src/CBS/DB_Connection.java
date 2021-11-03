/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CBS;

import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Geethan
 */
public class DB_Connection {
    
    Connection conn= null;  
    
    public DB_Connection(){   
    try{
        Class.forName("com.mysql.cj.jdbc.Driver"); 
        //conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/coachbookingdb","root","123123kajun123");
        conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/coachbookingdb","root","Ranuri&Geethan0329lv");
        //stmt = (Statement) conn.createStatement();
         if(conn != null){
            System.out.println("Connected");
         }
       }
      catch(Exception e){
          System.out.println(e);
       }
    }
    
    
        public boolean Insert(String sql){   
        boolean inserted = false;
        try 
        {
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            java.sql.Statement stat = conn.createStatement();    
            stat.executeUpdate(sql);
        } 
        catch( Exception e ) {
              e.printStackTrace();
         }
        return inserted;
        }
        
        
        public ResultSet Select(String selectQuery){   
        try{

            java.sql.Statement stat = conn.createStatement();    
            ResultSet rs=stat.executeQuery(selectQuery);
            return rs;        
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        return null;
    }
        
    public void preInsert(String id,String day){  
        try{
          String query = " insert into routedaytable(routeid,dayid)" + " values (?, ?)";
           // create the mysql insert preparedstatement
          PreparedStatement preparedStmt = conn.prepareStatement(query);
          preparedStmt.setString (1, id);
          preparedStmt.setString (2, day);
          // execute the preparedstatement
          preparedStmt.execute();
          conn.close();       
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
        public void update(String sql){  
        try{
;          java.sql.Statement stat = conn.createStatement(); 
           stat.executeUpdate(sql);
           System.out.println("Database updated successfully ");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
