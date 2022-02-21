
package ips.lab3.exercise4;

import isp.lab3.exercise4.MyPoint;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class mypointTest {
    @Test
    public void testDistance()
    {
        MyPoint p = new MyPoint(7, 4, 3);
        assertEquals(10.24, p.distance(17, 6, 2), 0.01);
        
        MyPoint p1 = new MyPoint(17, 6, 2);
        assertEquals(10.24, p.distance(p1), 0.01);
        
    }
    
}
