package com.examples.threads.methodlocks;

public class SharedCall {
    public static void main(String args[]) throws InterruptedException {
        SharedResource sr = new SharedResource();
        ThreadTest t = new ThreadTest();
        Thread t0 = new Thread(t);
        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 500 ;i++) {
                sr.increment();
            }

        });

        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 500 ;i++) {
                sr.increment();
            }

        });
        Thread t3 = new Thread(() -> {
            for(int i = 0; i < 500 ;i++) {
                sr.increment();
            }

        });

        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        System.out.println(sr.getCount());

    }
}
