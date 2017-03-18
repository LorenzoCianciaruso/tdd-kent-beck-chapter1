package com.lciancia.app.model;

public class Franch {
    private int amount;

    public Franch(int amount){
        this.amount = amount;
    }

    Franch times(int multiplier){
        return new Franch(amount * multiplier);
    }

    public boolean equals(Object object){
        Franch franch = (Franch) object;
        return amount == franch.amount;
    }
}
