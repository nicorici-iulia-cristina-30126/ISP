
package isp.lab4.exercise5;


public class FireAlarm {
    //attribute:
    private boolean active;
    
    //contructor:
    public FireAlarm(boolean active){ //constructor with argument
        this.active = active;
    }
    
    //methods:
    public boolean isActive(){
        return active; //return true or false
    }
    public void setActive(boolean active) {
        this.active = active;
    }
    public String toString() {
        return "FireAlarm{" + "active=" + active + '}';
    }
    
}
