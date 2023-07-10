package com.examples.threads;

public class RaceConditionCheck {
    public static void main(String[] args){
        Thread t1 = new Thread(new MyRunnableTwo(),"Thread 1");
        Thread t2 = new Thread(new MyRunnableTwo(),"Thread 2");
        t1.start();
        t2.start();

    }
}
