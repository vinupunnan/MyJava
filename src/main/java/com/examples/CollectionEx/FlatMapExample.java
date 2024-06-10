package com.examples.CollectionEx;

import com.examples.CollectionEx.utils.EmployDao;
import com.examples.CollectionEx.utils.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String args[]){
        List<Employee> employeeList = EmployDao.getEmployees();
      List<List<String>> employListWithinList=  employeeList.stream().map(e->e.getEmail()).collect(Collectors.toList());
      System.out.println(employListWithinList);
     List<String> employeStrings = employeeList.stream().flatMap(e->e.getEmail().stream()).collect(Collectors.toList());
     System.out.println(employeStrings);
    }
}
