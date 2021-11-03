/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CBS;

import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;   

/**
 *
 * @author 94702
 */
public class ClassLoginAndReg {
    
  //  public String userName;
  /*  public String password;
    public String firstName;
    public String surname;
    public String email;
    public String gender;
    public String dob;
    public String phoneNumber;
    public String address;*/
    JFrame f; 
    
    public boolean checkNewUser(String email){
     boolean hasRow = false;

    
    try{
        String selectQuery="select * from userTable WHERE email='"+email+"'";
        DB_Connection selectobj=new DB_Connection();
        ResultSet rs=selectobj.Select(selectQuery);
        while(rs.next())
            {
                f=new JFrame();  
                JOptionPane.showMessageDialog(f,"This user is already registered "); 
                hasRow=true;  
            }
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    
     return hasRow;
    }
    
    public void addUser(String firstName,String surname,String email,String password,String gender,String dob,String phoneNumber,String address){
        if(!checkNewUser(email)){
        try 
        {
         String sql = "INSERT INTO usertable(firstname,surname,email,password,gender,dob,phonenumber,address) VALUES ('" + firstName+ "','" + surname+ "','"+email+"','"+password+"','"+gender+"','"+dob+"','"+phoneNumber+"','"+address+"')";
         DB_Connection sqlObj=new DB_Connection();
         sqlObj.Insert(sql);  
         f=new JFrame();  
         JOptionPane.showMessageDialog(f,"Insert Succefull");  
        } catch( Exception e ){
           e.printStackTrace();
        }
        
        }

    }
    
    public boolean checkUserLogin(String email,String pass){
     boolean hasRow = false;
     String uID;
    
     try{
        String selectQuery="select * from userTable WHERE email='"+email+"' && password='"+pass+"'";
        DB_Connection selectobj=new DB_Connection();
        ResultSet rs=selectobj.Select(selectQuery);
        while(rs.next())
            {
                hasRow=true;
                uID=rs.getString("userid");
                userLogin(uID,"Customer");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    
     return hasRow;
    }
    
     public void userLogin(String userID,String role){
         
           DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
           LocalDateTime timeStamp = LocalDateTime.now();
           String isLog="1";
        try 
        {
         String sql = "INSERT INTO logs(userid,userrole,dateandtime,islogin) VALUES ('" + userID + "','" + role + "','"+timeStamp+"','"+isLog+"')";
         DB_Connection sqlObj=new DB_Connection();
         sqlObj.Insert(sql);  
         f=new JFrame();  
         JOptionPane.showMessageDialog(f,"Insert Succefull");  
        } catch( Exception e ){
           e.printStackTrace();
        }
         
     
     }
     public String isLogin(){
    // SELECT * FROM logs WHERE islogin ='" +1+ "';
        String isLog="no";
        String st="1";
        String role; 
       try{
        String selectQuery="SELECT * FROM logs WHERE islogin ='" +st+ "'";
        DB_Connection selectobj=new DB_Connection();
        ResultSet rs=selectobj.Select(selectQuery);
        while(rs.next())
            {
                isLog=rs.getString("userrole");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
         return isLog;
     }
}
