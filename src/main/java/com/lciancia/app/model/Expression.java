package com.lciancia.app.model;

public interface Expression {
    Money reduce(Bank bank, String to);
}
