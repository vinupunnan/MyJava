package com.examples.threads.executers;

public class ThreadOne implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello i M in Thread One");
    }
}
