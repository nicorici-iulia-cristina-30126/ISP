
package isp.lab6.exercise3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;


public class SensorClusterTest {
    SENSOR_TYPE t1 = SENSOR_TYPE.HUMIDITY;
        SENSOR_TYPE t2 = SENSOR_TYPE.PRESSURE;
        SENSOR_TYPE t3 = SENSOR_TYPE.TEMPERATURE;
        List<Sensor> sensorL = new ArrayList<Sensor>();    
        SensorsCluster sc = new SensorsCluster();
    @Test
    public void testAddSensor(){
        sensorL.add(sc.addSensor("IM012", t2));
        sensorL.add(sc.addSensor("IM123", t2));
        sensorL.add(sc.addSensor("IM120", t2));
        sensorL.add(sc.addSensor("IM012", t1));
        sensorL.add(sc.addSensor("IM000", t1));
        assertEquals("Numbers of sensor readins should be 4", 4, sc.getSensorList().size());
    }
    @Test
    public void testWriteSensorReadings(){
        sensorL.add(sc.addSensor("IS012", t3));
        sensorL.add(sc.addSensor("IS123", t3));
        sensorL.add(sc.addSensor("IS120", t2));
        sensorL.add(sc.addSensor("IS012", t3));
        sensorL.add(sc.addSensor("IS000", t1));
        boolean flag = sc.writeSensorReadings("IS000", 23, LocalDateTime.now());
        assertEquals("The flag should be true", true, flag);
    }
    @Test
    public void testgetSensorByld(){
        sensorL.add(sc.addSensor("IR012", t1));
        sensorL.add(sc.addSensor("IR123", t1));
        sensorL.add(sc.addSensor("IR120", t2));
        sensorL.add(sc.addSensor("IR012", t3));
        sensorL.add(sc.addSensor("IR000", t1));
        assertNull("Sensor should be null", sc.getSensorByld("IR00"));
    }
}
