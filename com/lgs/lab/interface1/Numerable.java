package com.lgs.lab.interface1;

public interface Numerable extends Plus, Minus, Multiply, Divide {
    @Override
    default void divide() {
        Divide.super.divide();
    }

    @Override
    default void deduct() {
        Minus.super.deduct();
    }

    @Override
    default void multiply() {
        Multiply.super.multiply();
    }

    @Override
    default void add() {
        Plus.super.add();
    }
}
