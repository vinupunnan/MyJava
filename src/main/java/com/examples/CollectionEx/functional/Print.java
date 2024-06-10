package com.examples.CollectionEx.functional;

public class Print implements PrinterInterface {
    @Override
    public void print() {
        System.out.println("I am in printer class which implemets printer Interface");
    }
}
