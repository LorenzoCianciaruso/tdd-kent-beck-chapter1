package com.lciancia.app.model;

public class Pair {
    String from;
    String to;

    public Pair(String from, String to){
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean equals(Object object) {
        Pair pair = (Pair) object;
        return from.equals(pair.from) && to.equals(pair.to);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
