package com.examples.threads.race;

public class RaceConditionExample {
    static int counter =0;
    public static void main(String args[]) throws InterruptedException {
   Runnable test = new CounterTask();
   Thread t1 = new Thread(test);
   Thread t2 = new Thread(test);
   t1.start();
   t2.start();
   t1.join();
   t2.join();
   System.out.println(counter);

//The counter will
    }
}
