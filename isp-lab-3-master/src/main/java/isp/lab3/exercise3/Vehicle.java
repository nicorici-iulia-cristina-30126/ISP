package isp.lab3.exercise3;
import java.util.Objects;

public class Vehicle {
    private String model, type;
    private int speed;
    private char fuelType = 'D';
    static int count = 0;
//    {
//        count += 1;
//    }
    
    public Vehicle(String model, String type, int speed, char ft){
        count++;
        this.model = model;
        this.type = type;
        this.speed = speed;
        this.fuelType = ft;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void setFuelType(char ft){
        this.fuelType = ft;
    }
    public String getModel(){
        return this.model;
    }
    public String getType(){
        return this.type;
    }
    public int getSpeed(){
        return this.speed;
    }
    public char getFuelType(){
        return this.fuelType;
    }
    public String toString(){
        return this.model + " (" + this.type + ") speed " + this.speed+"" +  " fuel type " + this.fuelType+"";
    }
            
    public boolean equals(Vehicle v){
        Vehicle other = (Vehicle)v;
        return (other.model.equals(this.model) && other.type.equals(this.type) && this.speed == other.speed && this.fuelType == other.fuelType);
    }
    public static void DisplayNoObjects(){
        System.out.println("Number of objects in main: " + Vehicle.count);
    }
    
    
    public static void main(String[] args){
        Vehicle v1 = new Vehicle("Dacia", "Loga", 150, 'B');
        Vehicle v2 = new Vehicle("abbn", "nm", 3022, 'A');
        v2.setModel("ab");
        v2.setType("mm");
        v2.setSpeed(12);
        v2.setFuelType('T');
//        v1.setModel("ab");
//        v1.setType("mm");
//        v1.setSpeed(12);
//        v1.setFuelType('T');
        System.out.println("V1=> model: " + v1.getModel() + ", type: " + v1.getType() + ", speed: " + v1.getSpeed() + ", fuelType: " + v1.getFuelType());
        System.out.println("V2=> model: " + v2.getModel() + ", type: " + v2.getType() + ", speed: " + v2.getSpeed() + ", fuelType: " + v2.getFuelType());
        if(v1.equals(v2)){ 
            System.out.println("Equals");
         }else{
            System.out.println("Not equals");
        }
        //System.out.println(v1);
        DisplayNoObjects();
        
    }
}
