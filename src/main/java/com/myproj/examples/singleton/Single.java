package com.myproj.examples.singleton;

public class Single {

    public String s;

    // Constructor
    // Here we will be creating private constructor
    // restricted to this class itself
    private Single() {
    s = "Hello I m a singelto fellow";

    }

    public static Single getInstance() {
        return new Single();
    }
}
