
package isp.lab3.exercise3;

import isp.lab3.exercise3.Vehicle;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class VehicleTest {
    @Test
    public void testtoString()
    {
        Vehicle v = new Vehicle("Dacia", "Logan", 150, 'B');
        String a = v.toString();
        assertEquals("Result: ", "Dacia (Logan) speed 150 fuel type B" , a);
    }
}
