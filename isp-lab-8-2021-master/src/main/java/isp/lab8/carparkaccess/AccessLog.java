
package isp.lab8.carparkaccess;

import java.io.Serializable;
import java.util.Date;
import lombok.Getter;

public class AccessLog implements Serializable {
    @Getter
    private Car car;
    @Getter
    private Date enterTime;
    @Getter
    private Date leavingTime;
    
    public AccessLog(Car car, Date enterTime){
        this.car = car;
        this.enterTime = enterTime;
    }
    public void setLeavingTime(Date leavingTime){
        this.leavingTime = leavingTime;
    }
    public int getTotalStayInSeconds(){
        return (int)((leavingTime.getTime() - enterTime.getTime()) / 1000);
    }
    @Override
    public String toString() {
        return "AccessLog{" + "car=" + car + ", enterTime=" + enterTime + ", leavingTime=" + leavingTime + '}';
    }
    
            
}
