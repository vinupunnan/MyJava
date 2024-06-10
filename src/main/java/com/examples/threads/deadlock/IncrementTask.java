package com.examples.threads.deadlock;

public class IncrementTask implements  Runnable{
    MyResource resource;
    public IncrementTask(MyResource resource) {
        this.resource=resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            resource.increment();
            try {
                Thread.sleep(100); // Just for demonstration
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
