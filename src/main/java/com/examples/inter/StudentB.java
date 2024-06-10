package com.examples.inter;

public class StudentB implements Book{
    @Override
    public void read() {
        System.out.println("Student B is reading ");
    }

    @Override
    public void write() {
        System.out.println("Student B is writing ");
    }
}
