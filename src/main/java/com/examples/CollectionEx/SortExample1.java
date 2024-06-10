package com.examples.CollectionEx;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortExample1 {
    public static void main(String args[]){
        ArrayList<Integer> i = new ArrayList();
        i.add(7);
        i.add(2);
    i.add(1);
    i.add(3);
    i.add(5);
    i.add(9);
    i.add(11);
    i.add(4);
     i.add(6);

    System.out.println("Originl list ========" +i)      ;



     List<Integer> sortedList = i.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted list ========" +sortedList)      ;



    }
}
