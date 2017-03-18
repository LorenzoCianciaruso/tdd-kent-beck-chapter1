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

}