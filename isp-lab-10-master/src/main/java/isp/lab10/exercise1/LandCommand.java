
package isp.lab10.exercise1;

import lombok.Getter;

public class LandCommand extends AtcCommand{
    @Getter
    private String aircraftId;
    
    public LandCommand(Aircraft aircraft){
        super(aircraft);
    }
}
