
package isp.lab4.exercise4;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class ControllerTest {
    
    @Test
    public void testControlStep(){
        TemperatureSensor t[] = new TemperatureSensor[3];
        t[0] = new TemperatureSensor(1, "nu");
        t[1] = new TemperatureSensor(5122, "tu");
        t[2] = new TemperatureSensor(4110, "cu");
        FireAlarm f = new FireAlarm(false);
        Controller cont = new Controller(t, f);
        cont.controlStep();
        
        assertEquals("Result: ", false, f.isActive());
    }
    
}
