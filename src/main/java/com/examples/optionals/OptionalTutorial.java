package com.examples.optionals;

public class OptionalTutorial {
    public static void main(String args[]) throws Exception {
        Cat mycat = findMyCat("kichu");
        System.out.println("My Cat Colour is " +mycat.getColour());
    }

    private static Cat findMyCat(String name) {
        //return new Cat("kichu","white");
        return null;
    }
}
