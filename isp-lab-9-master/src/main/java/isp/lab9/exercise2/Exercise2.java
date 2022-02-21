
package isp.lab9.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;


enum Type{
    TEMPERATURE, HUMIDITY, PRESSURE; 
}

class Observable{
    private List<Observer> observers = new ArrayList<Observer>();
 
    public void changeState(Object event, Object event1) {
        notifyAllObservers(event, event1);
    }
 
    public void register(Observer observer) {
        observers.add(observer);		
    }
 
    private void notifyAllObservers(Object event, Object event1) {
        for (Observer observer : observers) {
            observer.update(event, event1);
        }
    }
}

interface Observer {
   public abstract void update(Object event, Object event1);
}

class WeatherStation extends Observable{
    Type type;
    void readSensorTemperature(){
        Random random = new Random();
        this.changeState(type.TEMPERATURE, random.nextFloat());
    }
    void readSensorHumidity(){
        Random random = new Random();
        this.changeState(type.HUMIDITY, random.nextFloat());
    } 
    void readSensorPressure(){
        Random random = new Random();
        this.changeState(type.PRESSURE, random.nextFloat());
    }
}

class SensorController implements Observer{

    @Override
    public void update(Object event, Object event1) {
        System.out.println("The sensor type: " + event.toString() + " has changed with the value of: " + event1.toString());
    }
    
}

public class Exercise2 {
    public static void main(String[] args) throws InterruptedException {
        WeatherStation sensor = new WeatherStation();
        SensorController sensorController = new SensorController();
        sensor.register(sensorController);
        
        sensor.readSensorHumidity();
        TimeUnit.SECONDS.sleep(3);
        sensor.readSensorPressure();
        TimeUnit.SECONDS.sleep(3);
        sensor.readSensorTemperature();
        
        
    }
}