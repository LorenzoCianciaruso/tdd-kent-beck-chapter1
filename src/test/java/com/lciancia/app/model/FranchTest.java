package com.lciancia.app.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class FranchTest {

    @Test
    public void testFranchMultiplication() throws Exception {
        Franch five = new Franch(5);
        assertEquals(new Franch(10), five.times(2));
        assertEquals(new Franch(15), five.times(3));
    }

    @Test
    public void testEquality(){
        assertTrue(new Franch(5).equals(new Franch(5)));
        assertFalse(new Franch(5).equals(new Franch(6)));
    }
}