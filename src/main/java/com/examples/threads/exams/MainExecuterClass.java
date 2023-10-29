package com.examples.threads.exams;

public class MainExecuterClass {
    public static void main(String args[]){

        Thread t = new Thread(new RunnavleThread());
        t.start();
        System.out.println("I am in main");
        System.out.println("I am in main");
        System.out.println("I am in main");System.out.println("I am in main");
        System.out.println("I am in main");
        System.out.println("I am in main");


    }
}
