
package isp.lab10.exercise1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Aircraft extends Thread{ 
    
    private String ids;
    private int altitude;
    private AtcCommand command;

    public String getIds() {
        return ids;
    } 
    public Aircraft(String id){
        this.ids = id;
        this.altitude = 0;
    }
    public void receiveAtcCommand(AtcCommand cmd){
        command = cmd;
        if(!(cmd instanceof LandCommand)){
            altitude = ((TakeoffCommand)cmd).getAltitude();
        }
        synchronized(this){
            this.notify();
        }
    }
    @Override
    public void run(){
        long start = 0, finish = 0;
        float timeElapsed;
        
        System.out.println(ids + "->On stend");
        try {
            synchronized(this){
                this.wait();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Aircraft.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(ids + "->Taxing");
        try {
            Thread.sleep(10*1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Aircraft.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(ids + "->Taking off");
        try {
            Thread.sleep(5*1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Aircraft.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(ids + "->Ascending");
        try {
            Thread.sleep(altitude*10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Aircraft.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(ids + "->Cruising");
        try {
            synchronized(this){
                start = System.currentTimeMillis();
                this.wait();
                finish = System.currentTimeMillis();
            }
        } catch (InterruptedException ex) {
                Logger.getLogger(Aircraft.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(ids + "->Descending");
        try {
            Thread.sleep(altitude*10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Aircraft.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(ids + "->Landed");
        timeElapsed = (finish - start)/1000F;
        System.out.println("Time spend on Cruising state: " + timeElapsed);
    }

    @Override
    public String toString() {
        return "Aircraft{" + "ids=" + ids + ", altitude=" + altitude + '}';
    }
    
    
}