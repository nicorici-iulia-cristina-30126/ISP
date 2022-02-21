package isp.lab6.exercise1;

import java.time.LocalDateTime;

public class SensorReading {
    private int value;
    private String location;
    private Type type;

    public SensorReading(int value, String location, Type type) {
        this.value = value;
        this.location = location;
        this.type = type;
    }

    public SensorReading(int i, LocalDateTime now) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getValue() {
        return value;
    }

    public String getLocation() {
        return location;
    }

    public Type getType() {
        return type;
    }
}
