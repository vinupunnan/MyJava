package com.examples.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterStartOne {
    public static void main(String args[]){
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        Function f = s-> s.toString();
        Predicate<String> p =   t->t.startsWith("1");
        //myList.stream().map(f).filter(p).forEach(t ->System.out.println());
        System.out.println(myList.stream().map(f).filter(p).collect(Collectors.toList()));

    }


    }


