package isp.lab4.exercise2;

public class Exercise2 {
    
    public static void main(String[] args){
        boolean bool = true;
        
        FireAlarm fa = new FireAlarm(bool); //operatie de instantiere a unui obict de tip FireAlarm
        
        fa.setActive(false); 
        bool = fa.isActive();
        System.out.println("The fire alarm is " + bool);
    }
            
}
