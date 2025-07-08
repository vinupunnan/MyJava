package com.examples.threads;

public class PrintOdd implements Runnable
{
    private final SharedPrinter sharPrinter;
    public PrintOdd(SharedPrinter printer) {
        this.sharPrinter=printer;
    }

    @Override
    public void run() {

    }
}
