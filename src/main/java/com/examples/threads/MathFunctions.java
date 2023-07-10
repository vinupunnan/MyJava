package com.examples.threads;

public class MathFunctions {

    public static int calculateFact(int number) {

        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }
}