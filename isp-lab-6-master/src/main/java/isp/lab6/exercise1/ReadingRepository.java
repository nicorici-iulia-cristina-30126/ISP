
package isp.lab6.exercise1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class ReadingRepository implements IReadingRepository {
    
    private List<SensorReading> listSensorReading = new ArrayList<SensorReading>();

    @Override
    public void addReading(SensorReading reading) {
        listSensorReading.add(reading);
    }

    @Override
    public double getAvarageValueByType(Type type, String location) {
        double average = 0;
        for(SensorReading sr: listSensorReading){
            if(sr.getLocation().equals(location) && sr.getType().equals(type)){
                average++;
            }
        }
        return average;
    }

    @Override
    public List<SensorReading> getReadingsByType(Type type) { 
        List<SensorReading> specificType = new ArrayList<SensorReading>();
        for(SensorReading sr: listSensorReading){
            if(sr.getType().equals(type)){
                specificType.add(sr);
            }
        }
        return specificType;
    }

    @Override
    public void listSortedByLocation() {
        CompareLocation c = new CompareLocation();
        listSensorReading.sort(c);
    }

    @Override
    public void listSortedByValue() {
        CompareValue c = new CompareValue();
        listSensorReading.sort(c);
    }

    @Override
    public List<SensorReading> findAllByLocationAndType(String location, Type type) {
        List<SensorReading> specificTypeAndLocation = new ArrayList<SensorReading>();
        for(SensorReading sr: listSensorReading){
            if(sr.getType().equals(type) && sr.getLocation().equals(location)){
                specificTypeAndLocation.add(sr);
            }
        }
        return specificTypeAndLocation;
    }

    public void displayListSensorReading(){
        for(SensorReading sr: listSensorReading){
            System.out.println("Value " + sr.getValue() + ", location: " + sr.getLocation() + ", type: " + sr.getType());
        }
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
class CompareLocation implements Comparator<SensorReading>{

    @Override
    public int compare(SensorReading s1, SensorReading s2) {
        return s1.getLocation().compareTo(s2.getLocation());
    }
    
}