package com.examples.streams;

import com.examples.CollectionEx.utils.EmployDao;
import com.examples.CollectionEx.utils.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class NthSmallestElement {
    public static void  main (String args[]){
        Integer[] myArray = {4, 2, 7, 1, 5, 3, 6};
       int k = 3;
//   list
      // List<Employee> empList =  EmployDao.getEmployees();
        List<Integer> result =   Arrays.stream(myArray).filter(e->e>1).collect(Collectors.toList());

      // System.out.println(test.getAsInt());
    }
}
