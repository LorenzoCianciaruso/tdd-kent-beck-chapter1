package com.lciancia.app.model;

public class Franch extends Money {

    public Franch(int amount){
        this.amount = amount;
    }

    Money times(int multiplier){
        return new Franch(amount * multiplier);
    }
}
