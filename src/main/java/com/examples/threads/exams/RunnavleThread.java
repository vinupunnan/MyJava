package com.examples.threads.exams;

public class RunnavleThread implements Runnable{
    @Override
    public void run() {
        System.out.println("I m in the child runnable therad");
        System.out.println("I m in the child runnable therad2");
        System.out.println("I m in the child runnable therad3");
        System.out.println("I m in the child runnable therad4");
    }
}
