/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab6.exercise3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sensor {
    private SENSOR_TYPE type;
    private String id;
    private List<SensorReading> sensorReadingList = new ArrayList<SensorReading>();
    
    
    public Sensor(){}
    public Sensor(String id, SENSOR_TYPE type){
        this.id = id;
        this.type = type;
    }

    public List<SensorReading> getSensorReadingList() {
        return sensorReadingList;
    }
    public SENSOR_TYPE getType() {
        return type;
    }
    public String getId() {
        return id;
    }
    public void setType(SENSOR_TYPE type) {
        this.type = type;
    }

    public void setId(String id) {
        this.id = id;
    }
    public boolean addSensorReading(SensorReading sr){
        sensorReadingList.add(sr);
        return true;
    }
    public List<SensorReading> getSensorReadingsSortedByDataAndTime(){
        //SensorReading c = new SensorReading(12, dateAndTime);
        Collections.sort(sensorReadingList);
        return sensorReadingList;
    }
    public List<SensorReading> getReadingsSortedBuValue(){
        CompareValue c = new CompareValue();
        sensorReadingList.sort(c);
        return sensorReadingList;
    }
}


class CompareValue implements Comparator<SensorReading>{

    @Override
    public int compare(SensorReading s1, SensorReading s2) {
        if(s1.getValue() < s2.getValue()){
            return -1;
        }
        else if(s1.getValue() == s2.getValue()){
            return 0;
        }
        else{
            return 1;
        }
    }
    
}