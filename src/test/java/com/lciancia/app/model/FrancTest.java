package com.lciancia.app.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class FrancTest {

    @Test
    public void testFranchMultiplication() throws Exception {
        Franc five = Money.franch(5);
        assertEquals(Money.franch(10), five.times(2));
        assertEquals(Money.franch(15), five.times(3));
    }

    @Test
    public void testEquality() {
        assertTrue(Money.franch(5).equals(Money.franch(5)));
        assertFalse(Money.franch(5).equals(Money.franch(6)));
    }

    @Test
    public void testCurrency() {
        assertEquals("CHF", Money.franch(1).currency());
    }
}