
package isp.lab10.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ATC {
    private List<Aircraft> aircraftList = new ArrayList<Aircraft>();
    
    public void addAircraft(String id){
        aircraftList.add(new Aircraft(id));
    }
    
    public void showAircafts(){
        for(Aircraft ai: aircraftList){
            System.out.println(ai);
        }
    }
    public void sendCommand(String aircraftId, AtcCommand cmd) throws InterruptedException{
        boolean flag = false;
        for(Aircraft ai: aircraftList){
            if(aircraftId.equals(ai.getIds())){
                flag = true;
                if(cmd instanceof TakeoffCommand){
                    ai.start();
                }
                TimeUnit.SECONDS.sleep(5);
                ai.receiveAtcCommand(cmd);
                break;
            }
        }
        if(flag == false){
            System.out.println("This aircraft id doesn't exist");
        }
    }
}
