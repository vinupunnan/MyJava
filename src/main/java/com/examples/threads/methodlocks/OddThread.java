package com.examples.threads.methodlocks;

public class OddThread implements Runnable{

    int number;
    SharedPrinter sharedPrinter;

    public OddThread(int number,SharedPrinter p) {
        this.number = number;
        this.sharedPrinter= p;
    }

    @Override
    public void run() {
        for(int i =0 ;i<=number ;i++){
            if(i%2 !=0){
                sharedPrinter.printOdd(i);
            }
        }
    }
}
