package com.examples.outOfmem;

public class OOMProducer {
    public static void main(String[] args) throws Exception {

        System.out.println("Max JVM memory: " + Runtime.getRuntime().maxMemory());
        try {
            ProductManager productManager = new ProductManager();
            productManager.populateProducts();

        } catch (OutOfMemoryError outofMemory) {
            System.out.println("Catching out of memory error");

            throw outofMemory;
        }
    }
}
