
package isp.lab4.exercise2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class FireAlarmTest {
    FireAlarm fa = new FireAlarm(false);
    
    @Test
    public void testIsActive(){
        fa.setActive(false);
        assertEquals("Result: ", false, fa.isActive());
    }
    
}
