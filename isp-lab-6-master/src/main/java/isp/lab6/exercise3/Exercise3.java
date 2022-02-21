package isp.lab6.exercise3;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

public class Exercise3 {

    public static void main(String[] args) {
        SENSOR_TYPE t1 = SENSOR_TYPE.HUMIDITY;
        SENSOR_TYPE t2 = SENSOR_TYPE.PRESSURE;
        SENSOR_TYPE t3 = SENSOR_TYPE.TEMPERATURE;
        ZoneId zone1 = ZoneId.of("Asia/Kolkata");
        ZoneId zone2 = ZoneId.of("Asia/Tokyo");
        Clock clock1 = Clock.systemUTC();
        
        List<SensorReading> sensorList = new ArrayList<SensorReading>();
        sensorList.add(new SensorReading(12, LocalDateTime.now(zone1)));
        sensorList.add(new SensorReading(15, LocalDateTime.now(zone2)));
        sensorList.add(new SensorReading(34, LocalDateTime.now(clock1)));
        sensorList.add(new SensorReading(22, LocalDateTime.now()));
        List<SensorReading> sensorListSortedByValue = new ArrayList<SensorReading>();
        List<SensorReading> sensorListSortedByDateAndTime = new ArrayList<SensorReading>();
        
        
        Sensor s = new Sensor("IS092", t1);
        for(SensorReading sr: sensorList){
            s.addSensorReading(sr);
        }
        
        System.out.println("Sensor Reading sorted by date and time: ");
        sensorListSortedByDateAndTime = s.getSensorReadingsSortedByDataAndTime();
        for(SensorReading sr: sensorListSortedByDateAndTime){
            System.out.println("Value: " + sr.getValue() + ". Date and Time: " + sr.getDateAndTime());
        }
        System.out.println("\nSensor Reading sorted by value");
        sensorListSortedByValue = s.getReadingsSortedBuValue();
        for(SensorReading sr: sensorListSortedByValue){
            System.out.println("Value: " + sr.getValue() + ". Date and Time: " + sr.getDateAndTime());
        }
        
        List<Sensor> sensorL = new ArrayList<Sensor>();    
        SensorsCluster sc = new SensorsCluster();
        
        sensorL.add(sc.addSensor("IS012", t1));
        sensorL.add(sc.addSensor("IS123", t2));
        sensorL.add(sc.addSensor("IS120", t2));
        sensorL.add(sc.addSensor("IS012", t3));
        sensorL.add(sc.addSensor("IS000", t1));
        System.out.println("\nList of sensors from sensor cluster: ");
        for(Sensor sr: sensorL){
            System.out.println("ID: " + sr.getId() + " Type: " + sr.getType());
        }
        
        System.out.println("\nFrom Sensors Cluster:");
        boolean flag1 = sc.writeSensorReadings("IS000", 23, LocalDateTime.now(zone2));
       // System.out.println("flag = " + flag1);
        boolean flag2 = sc.writeSensorReadings("IS000", 100, LocalDateTime.now());
        if(flag1 == true && flag2 == true){
            sc.getSensorByld("IS000");
        }
    }
}
