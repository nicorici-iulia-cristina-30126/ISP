package isp.lab4.exercise1;


public class Exercise1 {

    public static void main(String[] args) {
        int value = 12;
        String location = "ABCD";
        
        TemperatureSensor ts = new TemperatureSensor(value, location); //operatie de instantiere a unui obict de tip TemperatureSenor
        
        System.out.println(ts); //toString method
    }
}
