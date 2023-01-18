package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable {

    @Override
    public void divide(int a, int b) {
        System.out.println("Divide = " + (a / b));

    }

    @Override
    public void deduct(int a, int b) {
        System.out.println("Deduct = " + (a - b));

    }

    @Override
    public void multiply(int a, int b) {
        System.out.println("Multiply = " + (a * b));

    }

    @Override
    public void add(int a, int b) {
        System.out.println("Plus = " + (a + b));

    }
}
