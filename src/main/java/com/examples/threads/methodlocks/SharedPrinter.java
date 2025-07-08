package com.examples.threads.methodlocks;

public class SharedPrinter {
    private boolean isOddTurn = true;

    public synchronized void printOdd(int number) {
        while (!isOddTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted");
            }
        }
        System.out.println("Odd: " + number);
        isOddTurn = false;
        notify();
    }

    public synchronized void printEven(int number) {
        while (isOddTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted");
            }
        }
        System.out.println("Even: " + number);
        isOddTurn = true;
        notify();
    }
}
