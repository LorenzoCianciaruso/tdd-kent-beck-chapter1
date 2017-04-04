package com.lciancia.app.model;

public class Money implements Expression {

    private int amount;
    private String currency;

    Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public String currency() {
        return this.currency;
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
                && currency().equals(money.currency);
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    public Expression plus(Money addend) {
        return new Money(amount + addend.amount, currency);
    }
}
