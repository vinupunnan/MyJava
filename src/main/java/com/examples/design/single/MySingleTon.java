package com.examples.design.single;

public class MySingleTon {

    private static final MySingleTon single = new MySingleTon();

    private MySingleTon() {
    }

    public static MySingleTon getInstance() {
        return single;

    }
}
