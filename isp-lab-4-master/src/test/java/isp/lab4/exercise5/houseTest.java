
package isp.lab4.exercise5;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class houseTest {
    @Test
    public void testControlStep(){
        TemperatureSensor t[] = new TemperatureSensor[3];
        t[0] = new TemperatureSensor(17, "aa");
        t[1] = new TemperatureSensor(5, "bb");
        t[2] = new TemperatureSensor(675, "cc");
        FireAlarm f = new FireAlarm(false);
        Controller c = new Controller(t, f);
        House h = new House(c);
        
        h.getController().controlStep();
        
        assertEquals("Result: ", true, f.isActive());
        
    }
}
