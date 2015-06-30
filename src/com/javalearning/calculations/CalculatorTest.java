package com.javalearning.calculations;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() throws  Exception{
        calculator = new Calculator();

    }
    @Test
    public void test_for_valid_output() throws Exception{
        assertEquals(5, calculator.add(2,3));
    }

    @Test
    public void test_for_invalid_output() throws  Exception{
        assertNotEquals(5, calculator.add(4,3));
    }

}