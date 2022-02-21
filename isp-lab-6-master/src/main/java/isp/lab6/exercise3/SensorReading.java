
package isp.lab6.exercise3;

import java.time.LocalDateTime;


public class SensorReading implements Comparable<SensorReading> {
    private double value;
    private LocalDateTime dateAndTime;
    
    public SensorReading(double value, LocalDateTime dateAndTime){
        this.value = value;
        this.dateAndTime = dateAndTime;
    }

    public double getValue() {
        return value;
    }
    public LocalDateTime getDateAndTime() {
        return dateAndTime;
    }
    @Override
    public int compareTo(SensorReading arg) {
        return this.dateAndTime.compareTo(arg.dateAndTime);
    }
    
}
