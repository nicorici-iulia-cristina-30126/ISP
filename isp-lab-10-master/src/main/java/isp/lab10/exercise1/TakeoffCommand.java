
package isp.lab10.exercise1;

import lombok.Getter;


public class TakeoffCommand extends AtcCommand{
    @Getter
    private int altitude;
    @Getter
    private String aircraftId;
    
    public TakeoffCommand(Aircraft aircraft, int altitude){
        super(aircraft);
        this.altitude = altitude;
    }
}
