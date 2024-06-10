package com.examples.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AverageAge {
    public static void main(String args[]) {
        List<Person> persons = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35));

       Double  test = persons.stream().collect(Collectors.averagingInt(Person::getAge));
       System.out.println(test);
    }
}