package com.examples.iterartor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeIterator {
    public static void main(String args[]){
        List<String> arrayTest = new CopyOnWriteArrayList<>();
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
