package com.examples.threads.deadlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyResource {

    private int count = 11;
    private final Lock lock = new ReentrantLock();

    public synchronized void increment() {
        //lock.lock();
        try {
            count++;
            System.out.println("Incremented by Thread: " + Thread.currentThread().getName() + ", Count: " + count);
        } catch (Exception e) {

        } finally {
           // lock.unlock();
        }

    }

    public synchronized void decrement() {
        //lock.lock();
        try {
            count--;
            System.out.println("Dceremented  by Thread: " + Thread.currentThread().getName() + ", Count: " + count);
        } catch (Exception e) {

        } finally {
          //  lock.unlock();
        }

    }

}

