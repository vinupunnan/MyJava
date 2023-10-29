package com.examples.strings;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CountStringsJava8 {
    public static void main(String args[]){
        String inputString = "ilovejavatechie";
       String[] inputArray = inputString.split("");
       List<String> inputList = Arrays.asList(inputArray);
       System.out.println(inputList.toString());
       System.out.println(inputList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));


    }
}
