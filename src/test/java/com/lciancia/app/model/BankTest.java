package com.lciancia.app.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankTest {

    @Test
    public void testReduceMoney() {
        Bank bank = new Bank();
        Money result = bank.reduce(Money.dollar(1), "USD");
        assertEquals(Money.dollar(1), result);
    }

    @Test
    public void testReduceMoneyOfDifferentCurrency() {
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Money result = bank.reduce(Money.franc(2), "USD");
        assertEquals(Money.dollar(1), result);
    }

    @Test
    public void testIdentityRate() {
        assertEquals(1, new Bank().rate("USD", "USD"));
    }

    @Test
    public void testMixedAddition(){
        Expression fiveBucks = Money.dollar(5);
        Expression tenFrancs = Money.franc(10);
        Expression sum = fiveBucks.plus(tenFrancs);

        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);

        Money result = bank.reduce(sum, "USD");
        assertEquals(result, Money.dollar(10));
    }
}