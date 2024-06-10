package com.examples.CollectionEx.functional;
@FunctionalInterface
public interface SampleFunctional {
    public abstract int addNumbers(int num1, int num2);

    public default int subtractNumbers(int num1, int num2) {
        return num1-num2;
    }

}
