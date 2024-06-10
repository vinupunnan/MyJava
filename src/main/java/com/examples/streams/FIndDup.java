package com.examples.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FIndDup {
    public static void main(String args[]){
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set mySet = new HashSet();

        myList.stream()
                .filter(n -> mySet.add(n))
                .forEach(System.out::println);

    }
}
