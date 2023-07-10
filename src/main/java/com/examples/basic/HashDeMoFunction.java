package com.examples.basic;

public class HashDeMoFunction {

    int i =0;
    public HashDeMoFunction(int i) {
        this.i = i;
    }

    public int hashCode()
    {
        return i;
    }

    public String toString()
    {
        return i + " ";
    }
}
