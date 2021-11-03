/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CBS;

import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author 94702
 */
public class ClassAdmin {
    private String deptCT;
    private String destCT;
    private String deptTime;
    private float price;
    private int capacity;
    JFrame f;  
    
    public ClassAdmin(String deptCT,String destCT,String deptTime,float price,int capacity){
      this.deptCT = deptCT;
      this.destCT = destCT;
      this.deptTime = deptTime;
      this.price = price;
      this.capacity =capacity;
    }
    
    
    
    public String getDeptCT() {
      return deptCT;
    }
    public String getDestCT() {
      return destCT;
    }
    
    public String getDeptTime() {
      return deptTime;
    }
    public float getPrice() {
      return price;
    }
    
    public int getCapacity() {
       return capacity;
    }
    
    

    public void addRoute(){
        try 
        {
         String sql = "INSERT INTO routetable(deptCT,destCT,deptTime,price,capacity) VALUES ('" + deptCT + "','" + destCT + "','" + deptTime + "','" + price + "','" + capacity + "')";
         DB_Connection sqlObj=new DB_Connection();
         sqlObj.Insert(sql);   
        } catch( Exception e ){
                 e.printStackTrace();
        }
    
    }
    
     public void checkBoxHandle(boolean s1,boolean s2,boolean s3,boolean s4,boolean s5,boolean s6,boolean s7){
        String maxids=getMaxid();
        if (s1) {
        try 
        {
         DB_Connection sqlObj=new DB_Connection();  
         sqlObj.preInsert(maxids,"1");
        } catch( Exception e ){
                 e.printStackTrace();
        }
        }
        
        if(s2) {
        try 
        {
         DB_Connection sqlObj=new DB_Connection();  
         sqlObj.preInsert(maxids,"2"); 
        } catch( Exception e ){
                 e.printStackTrace();
        }
        }
        
        if(s3) {
        try 
        {
         DB_Connection sqlObj=new DB_Connection();  
         sqlObj.preInsert(maxids,"3");
        } catch( Exception e ){
                 e.printStackTrace();
        }
        }
        
        if(s4) {
        try 
        {
         DB_Connection sqlObj=new DB_Connection();  
         sqlObj.preInsert(maxids,"4");
        } catch( Exception e ){
                 e.printStackTrace();
        }
        }
        
        if(s5) {
        try 
        {
         DB_Connection sqlObj=new DB_Connection();  
         sqlObj.preInsert(maxids,"5"); 
        } catch( Exception e ){
                 e.printStackTrace();
        }
        }
        
        if(s6) {
        try 
        {
         DB_Connection sqlObj=new DB_Connection();  
         sqlObj.preInsert(maxids,"6");
        } catch( Exception e ){
                 e.printStackTrace();
        }
        }
        
        if(s7) {
        try 
        {
         DB_Connection sqlObj=new DB_Connection();  
         sqlObj.preInsert(maxids,"7"); 
        } catch( Exception e ){
                 e.printStackTrace();
        }
        }
        f=new JFrame();  
        JOptionPane.showMessageDialog(f,"Insert Succefull");  
    }
     
     //maxid
     
    public String getMaxid(){
    String maxid;
     try{
        String selectQuery="select * from routetable WHERE routeid= (SELECT MAX(routeid) from routetable) ";
        DB_Connection selectobj=new DB_Connection();
        ResultSet rs=selectobj.Select(selectQuery);
        while(rs.next())
            {
                maxid=Integer.toString(rs.getInt("routeid"));
                return maxid;
            }   
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
     return null;
    }
    
}
