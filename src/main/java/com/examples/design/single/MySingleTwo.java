package com.examples.design.single;

public class MySingleTwo {
    private static final MySingleTwo myInstance = new MySingleTwo();

    private MySingleTwo(){

    }


   public synchronized static MySingleTwo getMyInstance() {
        return myInstance;
    }
}