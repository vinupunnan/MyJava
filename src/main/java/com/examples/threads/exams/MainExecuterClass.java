package com.examples.threads.exams;

public class MainExecuterClass {
    public static void main(String args[]){

        Thread child = new Thread( new RunnableThread());
        child.setPriority(Thread.MAX_PRIORITY);

        child.start();
        System.out.println("This is my main Thread");
    }
}
