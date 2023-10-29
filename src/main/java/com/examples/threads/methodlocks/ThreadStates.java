package com.examples.threads.methodlocks;

public class ThreadStates {
    public static void main (String args[]) throws Exception {
        //Thread t = new Thread(new )
        Thread myThread= new Thread (() ->
        {
            try {
                Thread.sleep(1000)
                ;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello My Thread");
        }
        );
        System.out.println("State Before Start" +myThread.getState());

        myThread.start();

        System.out.println("State.after .start " +myThread.getState());

        myThread.join();

        System.out.println("System.after join" +myThread.getState());
    }
}
