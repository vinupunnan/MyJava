package com.examples.threads.deadlock;

public class DecremenTask implements Runnable{
    MyResource resource;

    public DecremenTask(MyResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            resource.decrement();
            try {
                Thread.sleep(100); // Just for demonstration
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
