
package isp.lab4.exercise5;


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
        int i = 0;
        while(i < 3){
            
            if(temperatureSensor[i].getValue() > 50){
                
                System.out.println("Fire alarm started");
                fireAlarm.setActive(true);
            }
            else{
                System.out.println("Fire alarm not started");
            }
            i++;
        }
    }
}
