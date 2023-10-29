package com.examples.iterartor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastExample {
    public static void main(String args[]) throws Exception {
        List<String> arrayTest = new ArrayList<String>();
        arrayTest.add("a");
        arrayTest.add("b");
        arrayTest.add("c");

        Iterator<String> iterator = arrayTest.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            arrayTest.add("e");
        }

    }
}
