
package isp.lab4.exercise4;

public class Controller {
    //attributes:
    private TemperatureSensor[] temperatureSensor = new TemperatureSensor[3];
    private FireAlarm fireAlarm;
    
    //aggregation
    //contructor:
    public Controller(TemperatureSensor[] temperatureSensor, FireAlarm fireAlarm){
        this.temperatureSensor[0] = temperatureSensor[0];
        this.temperatureSensor[1] = temperatureSensor[1];
        this.temperatureSensor[2] = temperatureSensor[2];
        this.fireAlarm = fireAlarm;
    }
    
    //method:
    public void controlStep(){
        if(temperatureSensor[0].getValue() > 50 && temperatureSensor[1].getValue() > 50 && temperatureSensor[2].getValue() > 50){
            System.out.println("Fire alarm started");
            fireAlarm.setActive(true);
        }
        else{
            System.out.println("Fire alarm not started");
        }
    }
}
