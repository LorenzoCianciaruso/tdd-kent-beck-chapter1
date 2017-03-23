package com.lciancia.app.model;

abstract public class Money {
    protected int amount;

    abstract Money times(int multiplier);

    public boolean equals(Object object){
            Money money = (Money) object;
            return amount == money.amount
                    && getClass().equals(object.getClass());
    }

    static Money dollar(int amount) {
        return new Dollar(amount);
    }

    static Franch franch(int amount) {
        return new Franch(amount);
    }
}
