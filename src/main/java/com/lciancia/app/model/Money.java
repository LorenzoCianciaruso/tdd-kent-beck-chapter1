package com.lciancia.app.model;

public class Money {

    int amount;
    String currency;

    Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

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
                && currency().equals(money.currency);
    }

    static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    static Franc franch(int amount) {
        return new Franc(amount, "CHF");
    }

    public String toString(){
        return amount + " " + currency;
    }
}
