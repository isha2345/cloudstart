package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class MainTest {
    @Test
    public void testGetSum() {
        int num1 = 10;
        int num2 = 20;
        int result = Main.getSum(num1, num2);
        assertEquals(30, result);
    }
    @Test
    public void testGetSubtract(){
        int num1 = 10;
        int num2 = 20;
        int result = Main.getSubtract(num1, num2);
        assertEquals(10, result);
    }


}