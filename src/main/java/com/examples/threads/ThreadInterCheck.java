package com.examples.threads;

public class ThreadInterCheck {
    public static void main(String[] args){

        Thread t1 = new Thread(new ForThreadInterLeaving(),"Thread1");
        Thread t2 = new Thread(new ForThreadInterLeaving(), "Thread2");
        t1.start();
        t2.start();



    }
}
