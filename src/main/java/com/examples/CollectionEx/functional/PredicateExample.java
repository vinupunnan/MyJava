package com.examples.CollectionEx.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample  {

    public  static  void main (String args[]) {

        Predicate<Integer> p =     (t)-> t>0;
p.test(4);

        Predicate<Integer> predicate = (i) -> i % 2 == 0;
        Consumer<Integer> consume = i -> System.out.println(i);
        List<Integer> integerList = Arrays.asList(15, 12, 34, 77, 66, 36, 33);
        integerList.stream().filter(predicate).forEach(consume);
       List<Integer> filterdList = integerList.stream().sorted().filter(predicate).collect(Collectors.toList());
       System.out.println(filterdList);
    }
}
