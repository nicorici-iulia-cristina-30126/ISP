
package isp.lab4.exercise3;


public class Controller {
    //attributes:
    private TemperatureSensor temperatureSensor; //create an object temperatureSensor
    private FireAlarm fireAlarm; //create an object fireAlarm
    
    //aggregation
    //contructor:
    public Controller(TemperatureSensor temperatureSensor, FireAlarm fireAlarm){ 
        this.temperatureSensor = temperatureSensor;
        this.fireAlarm = fireAlarm;
    }
    
    //method:
    public void controlStep(){
        if(temperatureSensor.getValue() > 50){ //verf if temperature is > then 50
            System.out.println("Fire alarm started");
            fireAlarm.setActive(true); //set fire alarm true
        }
        else{
            System.out.println("Fire alarm not started");
        }
    }
}
