package isp.lab8.carparkaccess;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class CarParkingAccessApp {
    public static void main(String[] args) throws InterruptedException {
        //variables:
        int cost = 0;
        boolean flag1, flag2, flag3, flag4,flag5;
        
        //instantiation objects:
        CarParking cp = new CarParking(10);
        CarParkingController cpc = new CarParkingController(cp);
        List<AccessLog> accessLogList = new ArrayList<AccessLog>();
        List<DisplayForViewer> listOfCurrentCarsFromParkingLot;
        List<Integer> freespaces = new ArrayList<Integer>();
        
        //test in main  
        System.out.println("Display all the past entries for the car with plate number: CJ88SIM");
        listOfCurrentCarsFromParkingLot = cpc.getAllPastEntriesForCar(new Car("CJ88SIM"));
        for(DisplayForViewer d: listOfCurrentCarsFromParkingLot){
            System.out.println(d);
        }
        System.out.println("\n");
        Car car1 = new Car("AB08MIN");
        flag1 = cpc.enterCar(car1);
        if(flag1){
            System.out.println("The car with plate number " + car1.getPlateNumber() + " entered in parking lot");
        }
        
        TimeUnit.SECONDS.sleep(5);
        Car car2 = new Car("BM00POM");
        flag2 = cpc.enterCar(car2);
        if(flag2){
            System.out.println("The car with plate number " + car2.getPlateNumber() + " entered in parking lot");
            TimeUnit.SECONDS.sleep(5);
            cost = cpc.exitCar(car2);
            if(cost != 0){
                System.out.println("The car with plate number " + car2.getPlateNumber() + " leaved the parking lot");
                System.out.println("Car entered: " + cpc.getEnterCar());
                System.out.println("Car leaved: " + cpc.getLeaveCar());
                System.out.println("Total cost: " + cost + " lei");
            }
        }
        else{
                System.out.println("This car is not in parking lot!");
        }
        
        TimeUnit.SECONDS.sleep(3);
        Car car3 = new Car("BM00POM");
        flag3 = cpc.enterCar(car3);
        if(flag3){
            System.out.println("The car with plate number " + car3.getPlateNumber() + " entered in parking lot");
        }
        
        TimeUnit.SECONDS.sleep(10);
        Car car4 = new Car("B12TIC");
        flag4 = cpc.enterCar(car4);
        if(flag4){
            System.out.println("The car with plate number " + car4.getPlateNumber() + " entered in parking lot");
            TimeUnit.SECONDS.sleep(5);
            cost = cpc.exitCar(car4);
            if(cost != 0){
                System.out.println("The car with plate number " + car4.getPlateNumber() + " leaved the parking lot");
                System.out.println("Car entered: " + cpc.getEnterCar());
                System.out.println("Car leaved: " + cpc.getLeaveCar());
                System.out.println("Total cost: " + cost + " lei");
            }
        }
        else{
                System.out.println("This car is not in parking lot!");
        }
        
        TimeUnit.SECONDS.sleep(5);
        Car car5 = new Car("CJ34VAI");
        flag5 = cpc.enterCar(car5);
          if(flag5){
            System.out.println("The car with plate number " + car5.getPlateNumber() + " entered in parking lot");
        }
        
//        accessLogList = cpc.getAccessLogList();
//        for(AccessLog al: accessLogList){
//            System.out.println(al);
//        }
        
        TimeUnit.SECONDS.sleep(5);
        System.out.println("\nDisplay all current Parked Cars: ");
        listOfCurrentCarsFromParkingLot = cp.getCurrentParckedCars();
        for(DisplayForViewer d: listOfCurrentCarsFromParkingLot){
            System.out.println(d);
        }
        System.out.println("\nThe free spaces: ");
        cp.getFreeSapcesAvailble();
        freespaces = cp.getFreespaces();
        for(int k: freespaces){
            System.out.print("no" + k + ", ");
        }
        System.out.print("\n");
    }
}
