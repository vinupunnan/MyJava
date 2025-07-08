package com.examples.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfwords {
    public static void main(String args[]){
        List<String> fruitList= Arrays.asList("apple", "banana", "apple", "cherry",
                "banana", "apple");
     Map<String,Long> test =   fruitList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
     System.out.println(test);
    }
}
