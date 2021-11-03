/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CBS;

/**
 *
 * @author 94702
 */
public class ModelRoute {
    private int routeID;
    private String deptCT;
    private String destCT;
    private String deptTime;
    private String price;
    private int capacity;
    
    public ModelRoute(int routeID,String deptCT,String destCT,String deptTime,String price,int capacity){
       this.routeID = routeID;
      this.deptCT = deptCT;
      this.destCT = destCT;
      this.deptTime = deptTime;
      this.price = price;
      this.capacity =capacity;
    }
    
    public int routeID() {
       return routeID;
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
    public String getPrice() {
      return price;
    }
    
    public int getCapacity() {
       return capacity;
    }
    
    
}
