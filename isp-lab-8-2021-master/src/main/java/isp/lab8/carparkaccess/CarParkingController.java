
package isp.lab8.carparkaccess;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import lombok.Getter;

public class CarParkingController {
    @Getter
    private CarParking parking;
    @Getter
    private Date enterCar;
    @Getter
    private Date leaveCar;
    private AccessLog accessLog;
    @Getter
    private List<AccessLog> accessLogList = new ArrayList<AccessLog>();
    private List<DisplayForViewer> currentParkedCarList = new ArrayList<DisplayForViewer>();
    
    public CarParkingController(CarParking parking){
        this.parking = parking;
        readLogFromFile();
    }
    
    public boolean enterCar(Car car){
        if((parking.getNumberOfFreeSpots() > 0) && (!parking.hasCar(car))){
            parking.addCar(car);
            enterCar = new Date();
            accessLog = new AccessLog(car, enterCar);
            //writeLogToFile();
            accessLogList.add(accessLog);
            return true;
        }
        return false;
    }
    
    public int exitCar(Car car){
        if(parking.hasCar(car)){
            parking.ClearParkingSpot(car);
            leaveCar = new Date();
            accessLog.setLeavingTime(leaveCar);
            //writeLogToFile();
            return (int)((leaveCar.getTime() - enterCar.getTime()) / 1000);
        }
        return 0;
    }
    public List<DisplayForViewer> getAllPastEntriesForCar(Car car){
        List<DisplayForViewer> pastParkedCarList = new ArrayList<DisplayForViewer>();
        int costInSeconds = 0;
        for(AccessLog al: accessLogList){
            if(car.equals(al.getCar())){
                costInSeconds = al.getTotalStayInSeconds();
                pastParkedCarList.add(new DisplayForViewer(al.getCar().getPlateNumber(), al.getEnterTime(), costInSeconds));
            }
        }
        return pastParkedCarList;
    }
    
    
    public void readLogFromFile(){
        ObjectInputStream in =null;
        try {
            in = new ObjectInputStream(new FileInputStream("C:/Users/nicorici iulia/Desktop/Scoala/log.txt"));
            accessLogList = (List<AccessLog>)in.readObject();
        } catch (IOException ex) {
            Logger.getLogger(CarParkingController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CarParkingController.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            try {
                in.close();
            } catch (IOException ex) {
                Logger.getLogger(CarParkingController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void writeLogToFile(){
        ObjectOutputStream o =null;
        try {
            o = new ObjectOutputStream(new FileOutputStream("C:/Users/nicorici iulia/Desktop/Scoala/log.txt"));
            o.writeObject(accessLogList);
            //o.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CarParkingController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CarParkingController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                o.close();
            } catch (IOException ex) {
                Logger.getLogger(CarParkingController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
