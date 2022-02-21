package isp.lab4.exercise5;

public class Exercise5 {
    public static void main(String[] args){
        
        TemperatureSensor temp[] = new TemperatureSensor[3]; //operatie de intanstiere a unui obict de tip TemperatureSenor[]
        temp[0] = new TemperatureSensor(17, "aa");
        temp[1] = new TemperatureSensor(5, "bb");
        temp[2] = new TemperatureSensor(55, "cc");
        FireAlarm fire = new FireAlarm(false);//operatie de intanstiere a unui obict de tip FireAlarm
        Controller c = new Controller(temp, fire);//operatie de intanstiere a unui obict de tip Controller
        House house = new House(c);//operatie de intanstiere a unui obict de tip House
        
        house.getController().controlStep(); //call controlStep() method by accessing the controller trough House object
    }
}
