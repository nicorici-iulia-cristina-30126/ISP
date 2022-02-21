
package isp.lab6.exercise3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class SensorsCluster {
    private List<Sensor> sensorList = new ArrayList<Sensor>();

    public List<Sensor> getSensorList() {
        return sensorList;
    }
    public Sensor addSensor(String sensorId, SENSOR_TYPE type){
        Sensor sensorAdd = new Sensor(sensorId, type);
        Sensor toDelete = new Sensor(sensorId, type);
        for(Sensor s: sensorList){
            if(s.getId().equals(sensorId)){
                toDelete.setId("");
                toDelete.setType(null);
                return toDelete;
            }
        }
        sensorList.add(sensorAdd);
        return sensorAdd;
    }
    
    public boolean writeSensorReadings(String sensorId, double value, LocalDateTime dateTime){
        boolean flag = false;
        SensorReading sr = new SensorReading(value, dateTime);
        for(Sensor s: sensorList){
            if(s.getId().equals(sensorId)){
                s.addSensorReading(sr);
                flag = true;
                break;
            }
        }
        return flag;
    }
    public Sensor getSensorByld(String sensorId){
        Sensor sensor = new Sensor();
        List<SensorReading> sensorListSortedByValue = new ArrayList<SensorReading>();
        List<SensorReading> sensorListSortedByDateAndTime = new ArrayList<SensorReading>();
        int i = 0;
        for(Sensor s: sensorList){
            if(s.getId().equals(sensorId)){
                sensor.setType(s.getType());
                sensor.setId(s.getId());
                sensorListSortedByValue = s.getReadingsSortedBuValue();
                System.out.println("Sensor Reading sorted by value");
                for(SensorReading sr: sensorListSortedByValue){
                    System.out.println("Value: " + sr.getValue() + ". Date and Time: " + sr.getDateAndTime());
                }
                System.out.println("\nSensor Reading sorted by date and time: ");
                sensorListSortedByDateAndTime = s.getSensorReadingsSortedByDataAndTime();
                for(SensorReading sr: sensorListSortedByDateAndTime){
                    System.out.println("Value: " + sr.getValue() + ". Date and Time: " + sr.getDateAndTime());
                }
                i = 1;
                break;
            }
        }
        if(i == 0){
            sensor = null;
        }
        return sensor;
    }
}
