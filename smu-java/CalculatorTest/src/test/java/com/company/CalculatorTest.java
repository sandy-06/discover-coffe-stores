package com.company;

import static org.junit.Assert.*;

public class CalculatorTest {
    @org.junit.Test
    public void divide() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(10, 10);
        assertEquals(0, result);
    }

    }


