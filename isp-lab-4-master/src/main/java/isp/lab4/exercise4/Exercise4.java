package isp.lab4.exercise4;

public class Exercise4 {
    public static void main(String[] args){
        
        TemperatureSensor temp[] = new TemperatureSensor[3]; //operatie de intanstiere a unui obict de tip TemperatureSenor[]
        temp[0] = new TemperatureSensor(77, "aa");
        temp[1] = new TemperatureSensor(55, "bb");
        temp[2] = new TemperatureSensor(81, "cc");
        FireAlarm fire = new FireAlarm(false); //operatie de intanstiere a unui obict de tip FireAlarm
        Controller cont = new Controller(temp, fire); //operatie de intanstiere a unui obict de tip Controller
        
        cont.controlStep(); //controlStep method
    }
}
