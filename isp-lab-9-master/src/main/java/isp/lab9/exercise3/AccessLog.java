
package isp.lab9.exercise3;

import java.time.LocalDateTime;
import lombok.Getter;

public class AccessLog {
   
    @Getter
    private String tenantName;
    @Getter
    private LocalDateTime dateTime;
    @Getter
    private String operation;
    @Getter
    private DoorStatus doorStatus;
    @Getter
    private String ErrorMessage;
    
    
    public AccessLog(LocalDateTime dateTime, String operation, DoorStatus doorStatus, String ErrorMessage) {
        this.dateTime = dateTime;
        this.operation = operation;
        this.doorStatus = doorStatus;
        this.ErrorMessage = ErrorMessage;
    }
    public AccessLog(String tenantName, LocalDateTime dateTime, String operation, DoorStatus doorStatus, String ErrorMessage) {
        this.tenantName = tenantName;
        this.dateTime = dateTime;
        this.operation = operation;
        this.doorStatus = doorStatus;
        this.ErrorMessage = ErrorMessage;
    }

    @Override
    public String toString() {
        return "AccessLog{" + "tenantName=" + tenantName + ", dateTime=" + dateTime + ", operation=" + operation + ", doorStatus=" + doorStatus + ", ErrorMessage=" + ErrorMessage + '}';
    }
    
    
}
