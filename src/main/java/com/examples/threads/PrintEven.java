package com.examples.threads;

public class PrintEven implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println(i+2);
        }
    }
}
