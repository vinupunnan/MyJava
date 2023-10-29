package com.examples.threads.methodlocks;

public class SharedResource {

    private int count = 0;

     synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }


}
