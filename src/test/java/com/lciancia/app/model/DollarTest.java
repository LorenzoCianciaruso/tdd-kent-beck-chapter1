package com.lciancia.app.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DollarTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testMultiplication() throws Exception {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
        product = five.times(3);
        assertEquals(15, product.amount);
    }
}