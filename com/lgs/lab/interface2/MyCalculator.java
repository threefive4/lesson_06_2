package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable {
    int a = 456;
    int b = 12;

    @Override
    public void divide() {
        System.out.println("Divide = " + a / b);

    }

    @Override
    public void deduct() {
        System.out.println("Deduct = " + a * b);

    }

    @Override
    public void multiply() {
        System.out.println("Multiply = " + a * b);
    }

    @Override
    public void add() {
        System.out.println("Plus = " + a + b);

    }
}
