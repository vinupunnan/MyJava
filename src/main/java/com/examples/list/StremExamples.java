package com.examples.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StremExamples {
    public static void main(String args[]){
        List<Integer> list = new ArrayList<Integer>();
        list.add(33);
        list.add(78);
        list.add(14);
        list.add(50);
        list.add(22);
        list.add(63);
        List<Integer> doubledList= list.stream().map(r-> r*2).collect(Collectors.toList());

        for( Integer i :doubledList){
            System.out.println(i);
        }
    }
}
