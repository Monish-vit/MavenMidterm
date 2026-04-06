package com.example; 
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class AppTest {
    @Test
    public void testSlab1() {
        assertEquals(82.5, App.calculateBill(50), 0.001);
    }
    @Test
    public void testSlab2() {
        assertEquals(330.0, App.calculateBill(150), 0.001);
    }
    @Test
    public void testSlab3() {
        assertEquals(1375.0, App.calculateBill(400), 0.001);
    }
}
