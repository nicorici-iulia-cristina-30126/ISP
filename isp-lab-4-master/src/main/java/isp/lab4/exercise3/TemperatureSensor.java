package isp.lab4.exercise3;

public class TemperatureSensor {
    //attributes:
    private int value; 
    private String location;
    
    //contructors:
    public TemperatureSensor(){} //contructor no-arg
    public TemperatureSensor(int type, String location){ //contructor with argumentrs
        this.value = type;
        this.location = location;
    }
    
    //methods:
    public int getValue() {
        return value; //return an int
    }
    public String getLocation() {
        return location; //return a string
    }
    public String toString() {
        return "TemperatureSensor{" + "value=" + value + ", location=" + location + '}';
    }
    
    
}
