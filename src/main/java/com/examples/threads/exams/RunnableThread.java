package com.examples.threads.exams;

public class RunnableThread implements Runnable{
    @Override
    public void run() {
      System.out.println("Hello I am the child thread");
      for(int i =0;i<10;i++){
          System.out.println(i);
      }

    }
}
