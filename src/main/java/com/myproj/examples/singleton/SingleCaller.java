package com.myproj.examples.singleton;

public class SingleCaller {
    public static void main(String[] args) throws Exception {

        Single x = Single.getInstance();

        // Instantiating Singleton class with variable y
        Single y = Single.getInstance();

        // Instantiating Singleton class with variable z
        Single z = Single.getInstance();

        System.out.println("Hashcode of x is "
                + x.hashCode());
        System.out.println("Hashcode of y is "
                + y.hashCode());
        System.out.println("Hashcode of z is "
                + z.hashCode());

    }
}
