package com.company;

public class GenericPair<E> {
    E a, b;

    public GenericPair() {
    }

    public GenericPair(E a, E b) {
        this.a = a;
        this.b = b;
    }

    public E getA() {
        return a;
    }

    public void setA(E a) {
        this.a = a;
    }

    public E getB() {
        return b;
    }

    public void setB(E b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "GenericPair{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
