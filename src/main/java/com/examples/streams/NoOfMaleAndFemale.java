package com.examples.streams;

import com.examples.CollectionEx.utils.EmployDao;
import com.examples.CollectionEx.utils.Employee;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NoOfMaleAndFemale {
    public static  void main(String args[]){
        List<Employee> employeeList = EmployDao.getEmployees();
     // Map<String ,List<Employee>> gp =  employeeList.stream().collect(Collectors.groupingBy(e->e.getGender()));
                                                                                   // classifier ,downstream
     Map<String,Long> myMap =  employeeList.stream().collect(Collectors.groupingBy(e->e.getGender(),Collectors.counting()));
     System.out.println(myMap);



    }
}
