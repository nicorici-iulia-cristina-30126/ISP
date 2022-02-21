package isp.lab10.exercise1;

import java.util.concurrent.TimeUnit;



public class Exercise1 {

    public static void main(String[] args) throws InterruptedException {
        ATC atc = new ATC();
        Aircraft a1 = new Aircraft("I202");
        Aircraft a2 = new Aircraft("A101");
        Aircraft a3 = new Aircraft("V1102");
        AtcCommand command = new AtcCommand(a1);
        
        atc.addAircraft(a1.getIds());
        atc.addAircraft(a2.getIds());
        atc.addAircraft(a3.getIds());
       
        atc.sendCommand("I202", new TakeoffCommand(a1, 2));
        atc.sendCommand("A101", new TakeoffCommand(a2, 3));
        TimeUnit.MINUTES.sleep(1);
        atc.sendCommand("I202", new LandCommand(a1));
        
        //TimeUnit.SECONDS.sleep(30);
        //atc.sendCommand("A101", new TakeoffCommand(a2, 2));
        TimeUnit.SECONDS.sleep(55);
        atc.sendCommand("A101", new LandCommand(a2));
    }
}
