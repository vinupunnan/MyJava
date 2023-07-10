package com.examples.threads;

import java.time.LocalDateTime;

public class FirstThread {
    public static void main(String[] args) {
        System.out.println("Iam in main")
        ;
        System.out.println("Iam in main2");
        System.out.println("Iam in main3");
        System.out.println("Iam in main4");
        System.out.println("Iam in main5");

        Runnable run = new MyRunnable();
      //  run.run();

        Thread t = new Thread(run);
        t.start();
        System.out.println("Iam in main6");
        System.out.println("Iam in main7");
        System.out.println("Iam in main8");
        System.out.println("Iam in main9");
        Runnable r3 =()-> System.out.println("Lamdaaa");
        Thread t2 = new Thread(r3);
        t2.start();


       /*
        // Normal Thred
        Thread testThred = new Thread(new Mythread());
        testThred.start();
        Mythread t = new Mythread(); //Tred instantiation
        t.start();

        System.out.println("I m in main Thread");
       // Runnable Thread
          Runnable runnable = new MyRunnable();
          Thread t2 = new Thread(runnable);
          t2.start();
        //Using lamda Expressions
        Runnable r2 = () -> {   // lambda expression
            System.out.println("Runnable with Lambda Expression");
        };
        r2.run();*/
//System.out.println("Start Time" + LocalDateTime. now());

//        for(int i =0;i<1000;i++){
//            Thread taskThread = new Thread(new MyTask());
//        taskThread.start();
//        }
      //  System.out.println("End Time" +LocalDateTime. now());
    }

}
