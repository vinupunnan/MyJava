package com.examples.functional;

import java.util.Comparator;
import java.util.concurrent.Callable;

public class PrintingClassNormal {
    public static void main(String args[]){
        PrinterInterface printInter = new Print();
        printInter.print();


    }
}
