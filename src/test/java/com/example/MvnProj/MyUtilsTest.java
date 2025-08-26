package com.example.MvnProj;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyUtilsTest {

    @Test
    void testAdd() {
        assertEquals(8, MyUtils.add(5, 3), "5 + 3 should be 8");
    }

    @Test
    void testSub() {
        assertEquals(2, MyUtils.sub(5, 3), "5 - 3 should be 2");
    }

    @Test
    void testMul() {
        assertEquals(15, MyUtils.mul(5, 3), "5 * 3 should be 15");
    }

    @Test
    void testDiv() {
        assertEquals(2, MyUtils.div(6, 3), "6 / 3 should be 2");
    }

    @Test
    void testDivByZero() {
        assertThrows(ArithmeticException.class, () -> MyUtils.div(5, 0), "Division by zero should throw ArithmeticException");
    }
}
