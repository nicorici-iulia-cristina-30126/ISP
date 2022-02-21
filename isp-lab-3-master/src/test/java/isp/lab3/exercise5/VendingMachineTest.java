/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab3.exercise5;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 *
 * @author nicorici iulia
 */
public class VendingMachineTest {
    VendingMachine test = new VendingMachine();
   
    @Test
    public void testInsertCoin()
    {
        test.insertCoin(12);
        assertEquals("Result: ", 12, test.value);
    }
    
    @Test
    public void testSelectProduct()
    {
        assertEquals(" ", "Twix", test.selectProduct(1));
    }
}
