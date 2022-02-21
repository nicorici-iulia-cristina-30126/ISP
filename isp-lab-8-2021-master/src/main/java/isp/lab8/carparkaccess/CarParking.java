
package isp.lab8.carparkaccess;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

public class CarParking {
    private List<DisplayForViewer> currentParkedCarList = new ArrayList<DisplayForViewer>();
    private List<ParkingSpot> parkingSpotsList;
    private List<Date> enterTime = new ArrayList<Date>();
    @Getter
    private List<Integer> freespaces = new ArrayList<Integer>();

    public CarParking(int numberOfParkingSpots) {
        parkingSpotsList = new ArrayList<ParkingSpot>(); //composition relation
        for(int i = 0; i < numberOfParkingSpots; i++)
        {
            parkingSpotsList.add(new ParkingSpot(i)); //create the parking spot
        }
        
    }
    public int getNumberOfFreeSpots(){
        int numberOfFreeSpots = 0;
        for(ParkingSpot ps: parkingSpotsList){
            if(ps.isFree()){    //check if the parking spot is free
                numberOfFreeSpots++;
            }
        }
        return numberOfFreeSpots; 
    }
    public void addCar(Car car){
        for(ParkingSpot ps: parkingSpotsList){
            if(ps.isFree()){
                ps.putCarOnSpot(car);
                enterTime.add(new Date());
                break;
            }
        }
    }
    public boolean hasCar(Car car){
        for(ParkingSpot ps: parkingSpotsList){
            if(ps.getCarOnThisSpot() == null){
                continue;
            }
            else if(car.equals(ps.getCarOnThisSpot())){
                return true;
            }
        }
        return false;
    }
    public void ClearParkingSpot(Car car){
        int i = 0;
        for(ParkingSpot ps: parkingSpotsList){
            if(ps.getCarOnThisSpot() == null){
                continue;
            }
            else if(car.equals(ps.getCarOnThisSpot())){
                ps.DeleteCarOnThisParkingSpot();
                enterTime.remove(i);
                break;
            }
            i++;
        }
    }
    public List<DisplayForViewer> getCurrentParckedCars(){
        int i = 0;
        Date currentTime;
        int cuurentCost = 0;
        for(ParkingSpot ps: parkingSpotsList){
            if(ps.getCarOnThisSpot() != null){
                currentTime = new Date();
                cuurentCost = (int)((currentTime.getTime() - enterTime.get(i).getTime()) / 1000);
                currentParkedCarList.add(new DisplayForViewer(ps.getCarOnThisSpot().getPlateNumber(), enterTime.get(i), cuurentCost));
            }
            else{
                continue;
            }
            i++;
        }
        return currentParkedCarList;
    }
    public void getFreeSapcesAvailble(){
        int i = 0;
        for(ParkingSpot ps: parkingSpotsList){
            if(ps.getCarOnThisSpot() == null){
                freespaces.add(i);
            }
            i++;
        }
    }
}



class ParkingSpot{
    @Getter @Setter
    private Car carOnThisSpot;
    @Getter @Setter
    private int indexOfParkingSpot;

    public ParkingSpot(int indexOfParkingSpot) {
        this.indexOfParkingSpot = indexOfParkingSpot;
    }
    public void putCarOnSpot(Car car){
        this.carOnThisSpot = car;
    }
    public boolean isFree(){
        return this.carOnThisSpot == null;
    }
    public void DeleteCarOnThisParkingSpot(){
        this.carOnThisSpot = null;
        
    }

    @Override
    public String toString() {
        return "ParkingSpot{" + "carOnThisSpot=" + carOnThisSpot + ", indexOfParkingSpot=" + indexOfParkingSpot + '}';
    }
    
    
    
}