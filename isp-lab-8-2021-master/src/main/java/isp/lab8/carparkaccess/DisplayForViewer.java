
package isp.lab8.carparkaccess;

import java.util.Date;



public class DisplayForViewer{
    private String plateNumber;
    private Date enterCar;
    private int cost;
    
    public DisplayForViewer(String plateNumber, Date enterCar, int cost){
        this.plateNumber = plateNumber;
        this.enterCar = enterCar;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "[" + "plateNumber=" + plateNumber + ", enterCar=" + enterCar + ", cost=" + cost + ']';
    }
    
    
    
    
}
