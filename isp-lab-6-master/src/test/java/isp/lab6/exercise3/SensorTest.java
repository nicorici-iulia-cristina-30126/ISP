
package isp.lab6.exercise3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;


public class SensorTest {
    
    @Test
    public void testAddSensorReading(){
        SENSOR_TYPE t1 = SENSOR_TYPE.PRESSURE;
        List<SensorReading> sList = new ArrayList<SensorReading>();
        sList.add(new SensorReading(12, LocalDateTime.now()));
        sList.add(new SensorReading(15, LocalDateTime.now()));
        sList.add(new SensorReading(34, LocalDateTime.now()));
        sList.add(new SensorReading(22, LocalDateTime.now()));
        Sensor s = new Sensor("IS092", t1);
        for(SensorReading sr: sList){
            s.addSensorReading(sr);
        }
        assertEquals("Numbers of sensor readins should be 4", 4, s.getSensorReadingList().size());
    }
}
