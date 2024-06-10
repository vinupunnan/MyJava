package com.examples.inter;

public class StudentA implements Book
{
    @Override
    public void read() {
        System.out.println("Student A is reading ");
    }

    @Override
    public void write() {
        System.out.println("Student A is writing ");
    }
}
