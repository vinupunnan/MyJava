package com.examples.threads.methodlocks;

public class EvenThread implements  Runnable{
    int number;
    SharedPrinter printer;
    public EvenThread(int number,SharedPrinter printer) {
        this.number = number;
        this.printer= printer;
    }

    @Override
    public void run() {
        for (int i =0; i<number ;i++){
          if(i%2 ==0){
              printer.printEven(i);
          }
        }
    }
}
