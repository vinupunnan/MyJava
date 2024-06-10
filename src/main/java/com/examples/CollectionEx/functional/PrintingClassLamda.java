package com.examples.CollectionEx.functional;

public class PrintingClassLamda {
    public static void main(String args[]){
        PrinterInterface printInter = ()->System.out.println("Invoked Using Lamda Expression");
        printInter.print();
    }
}
