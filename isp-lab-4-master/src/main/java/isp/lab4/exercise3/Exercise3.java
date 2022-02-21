
package isp.lab4.exercise3;


public class Exercise3 {
    
   public static void main(String[] args){
       TemperatureSensor temp = new TemperatureSensor(12, "nun"); //operatie de intanstiere a unui obict de tip TemperatureSenor
       FireAlarm fire = new FireAlarm(false); //operatie de instantiere a unui obict de tip FireAlarm
       Controller cont = new Controller(temp, fire); //operatie de instantiere a unui obict de tip Controller
       
       cont.controlStep(); //controlStep method
   }
    
}
