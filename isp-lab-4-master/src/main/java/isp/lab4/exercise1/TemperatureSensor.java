package isp.lab4.exercise1;


public class TemperatureSensor {
    //attributes:
    private int value;
    private String location;
    
    //contructors:
    public TemperatureSensor(){} //contructor no-arg
    public TemperatureSensor(int type, String location){ //contructor with arguments
        this.value = type;
        this.location = location;
    }
    
    //methods:
    public int getValue() {
        return value;
    }
    public String getLocation() {
        return location;
    }
    public String toString() {
        return "TemperatureSensor{" + "value=" + value + ", location=" + location + '}';
    }
    
    
}
