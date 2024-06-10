package com.examples.threads.methodlocks;

public class SharedResource {

    private int count = 0;
    private transient int k;
    private final int j=0;
    transient final int m = 50;

    synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }


}
