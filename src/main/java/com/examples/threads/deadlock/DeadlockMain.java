package com.examples.threads.deadlock;

public class DeadlockMain {
    public static void main(String args[]) {
        MyResource resource = new MyResource();
        IncrementTask incrementTask = new IncrementTask(resource);
        DecremenTask decrementTask = new DecremenTask(resource);

        Thread t = new Thread(incrementTask);
        Thread t2 = new Thread(decrementTask);
        t.start();
        t2.start();

    }
}
