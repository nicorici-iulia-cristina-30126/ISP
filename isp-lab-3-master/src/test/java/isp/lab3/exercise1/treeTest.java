/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab3.exercise1;

import isp.lab3.exercise1.Tree;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author nicorici iulia
 */
public class treeTest {
    
    @Test
    public void testGrow()
    {
        Tree t = new Tree();
        t.Grow(5);
        assertEquals("Should add 2 numbers", 20, t.height);
        
    }
    @Test
    public void testtoString()
    {
        Tree t = new Tree();
        String s = t.ToString();
        assertEquals("Result: ", "15", s);
    }
}
