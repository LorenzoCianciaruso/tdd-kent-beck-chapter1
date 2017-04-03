package com.lciancia.app.model;

abstract public class Money {

    int amount;
    String currency;

    abstract Money times(int multiplier);

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public String currency(){
        return this.currency;
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
                && getClass().equals(object.getClass());
    }

    static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    static Franc franch(int amount) {
        return new Franc(amount, "CHF");
    }
}
