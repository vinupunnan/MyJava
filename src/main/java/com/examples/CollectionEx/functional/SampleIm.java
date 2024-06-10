package com.examples.CollectionEx.functional;

public class SampleIm {
    private int calculationMethod(SampleFunctional intr, int x, int y) {
        return intr.addNumbers(x, y);
    }

    public int invokingMethod(int number1, int number2) {
        //Invoke the calculation method - create first argument through a lambda
        return calculationMethod((x,y)-> x+y, number1, number2);
    }
}
