
package isp.lab4.exercise6;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EmployeeTest {
    
    @Test
    public void testGetPaymentAmount(){
        Employee[] e = new Employee[3];
        e[0] = new HourlyEmployee("Lim", "Campbell", 25.00, 65);
        e[1] = new SalariedEmployee("Beech", "Abel", 4);
        e[2] = new CommissionEmployee("Steadman", "Layla", 1, 2);
        assertEquals("Result:", 1937.5, e[0].getPaymentAmount(), 0);
        assertEquals("Result:", 16, e[1].getPaymentAmount(), 0);
        assertEquals("Result:", 2, e[2].getPaymentAmount(), 0);
    }
}
