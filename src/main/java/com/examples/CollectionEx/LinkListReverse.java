package com.examples.CollectionEx;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkListReverse {
    public static void main(String args[])throws Exception{
        List testList = new LinkedList();
        testList.add(12);
        testList.add(20);
        testList.add(11);
        System.out.println(testList);
        Collections.reverse(testList);
        System.out.println(testList);

    }
}
