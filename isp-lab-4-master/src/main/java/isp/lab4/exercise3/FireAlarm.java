
package isp.lab4.exercise3;

public class FireAlarm {
    //attribute:
    private boolean active;
    
    //contructor:
    public FireAlarm(boolean active){
        this.active = active;
    }
    
    //methods:
    public boolean isActive(){
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
    public String toString() {
        return "FireAlarm{" + "active=" + active + '}';
    }
    
}
