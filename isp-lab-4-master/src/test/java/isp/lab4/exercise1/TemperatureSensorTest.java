package isp.lab4.exercise1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TemperatureSensorTest {
    TemperatureSensor ts = new TemperatureSensor(12, "n");
    
    @Test
    public void testTemperatureSensor()
    {
        assertEquals("Restul value: " , 12, ts.getValue());
        assertEquals("Result location: ", "n", ts.getLocation());
    }
}
