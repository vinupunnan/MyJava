package com.examples.threads.race;

public class CounterTask implements Runnable{
    @Override
    public void run() {

        for (int i = 0; i < 1000; i++){
            synchronized(this) {
                RaceConditionExample.counter++;
            }
        }
    }
}
