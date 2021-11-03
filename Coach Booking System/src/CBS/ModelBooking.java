/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CBS;

/**
 *
 * @author 94702
 */
public class ModelBooking {
    
    private int bookingID;
    private int userID; 
    private int routeID; 
    private int dayID; 
    private int seatNO; 
    private String deptDate;
    private String bookingDate;
    
    
    public ModelBooking(int bookingID,int userID,int routeID,int dayID,int seatNO,String deptDate,String bookingDate){
      this.bookingID = bookingID;
      this.userID = userID;
      this.routeID = routeID;
      this.dayID = dayID;
      this.seatNO = seatNO;
      this.deptDate =deptDate;
      this.bookingDate =bookingDate;
    
    }
    
    public int bookingID() {
       return bookingID;
    }
    public int userID() {
       return userID;
    }
    public int routeID() {
       return routeID;
    }
    public int dayID() {
       return dayID;
    }
    public int seatNO() {
       return seatNO;
    }
    public String deptDate() {
      return deptDate;
    }
    public String bookingDate() {
      return bookingDate;
    }
    
}
