package isp.lab6.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        //instantiation of objects:
        Type t1 = Type.HUMIDITY;
        Type t2 = Type.TEMPERATURE;
        Type t3 = Type.PRESSURE;
        ReadingRepository r = new ReadingRepository();
        List<SensorReading> listSensors= new ArrayList<SensorReading>();
        listSensors.add(new SensorReading(40, "Bistrita", t1));
        listSensors.add(new SensorReading(0, "Cluj_Napoca", t3));
        listSensors.add(new SensorReading(30, "Bistrita", t1));
        listSensors.add(new SensorReading(10, "Deva", t2));
        List<SensorReading> sensorsByTypeList = new ArrayList<SensorReading>();
        List<SensorReading> sensorsByTypeAndLocationList = new ArrayList<SensorReading>();  
        
        //add in readingRepository:
        for(SensorReading st:listSensors){
            r.addReading(st);
        }
        
        //calculate the average form a specific type and location:
        double average = r.getAvarageValueByType(t1, "Bistrita");
        System.out.println("The average: " + average);
        
        System.out.println("List of all readings for type " + t1);
        sensorsByTypeList = r.getReadingsByType(t1);
        for(SensorReading sr:sensorsByTypeList){
            System.out.println("Value " + sr.getValue() + ", location: " + sr.getLocation() + ", type: " + sr.getType());
        }
        
        System.out.println("\nList of all readings for type: " + t1 + " and for location: Bistrita");
        sensorsByTypeAndLocationList = r.findAllByLocationAndType("Bistrita", t1);
        for(SensorReading sr: sensorsByTypeAndLocationList){
            System.out.println("Value " + sr.getValue() + ", location: " + sr.getLocation() + ", type: " + sr.getType());
        } 
        
        System.out.println("\nSensors sorted by value: ");
        r.listSortedByValue();
        r.displayListSensorReading();
        System.out.println("\nSensors sorted by location: ");
        r.listSortedByLocation();
        r.displayListSensorReading();
    }
}
