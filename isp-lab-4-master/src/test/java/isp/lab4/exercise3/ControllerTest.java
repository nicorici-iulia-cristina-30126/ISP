
package isp.lab4.exercise3;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class ControllerTest {
    TemperatureSensor ts = new TemperatureSensor(12, "n");
    FireAlarm fa = new FireAlarm(false);
    Controller c = new Controller(ts, fa);
    
    @Test
    public void testControlStep(){
        c.controlStep();
        assertEquals("Result:", false, fa.isActive());
    }
    
}
