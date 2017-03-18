package com.lciancia.app.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DollarTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testTimes() throws Exception {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}