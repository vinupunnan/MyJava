package com.examples.threads.methodlocks;

public class OddEvenThreadStarter {
    public static void main (String args[]){
          SharedPrinter printer = new SharedPrinter();
          Thread oddThread = new Thread(new OddThread(20,printer));


        Thread evenThread = new Thread(new EvenThread(20,printer));
        oddThread.start();
        evenThread.start();



    }
}
