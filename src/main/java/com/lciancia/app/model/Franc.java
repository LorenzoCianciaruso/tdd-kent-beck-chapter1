package com.lciancia.app.model;

public class Franc extends Money {

    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    Money times(int multiplier) {
        return Money.franch(amount * multiplier);
    }
}