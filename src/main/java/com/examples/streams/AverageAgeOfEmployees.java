package com.examples.streams;

import com.examples.CollectionEx.utils.EmployDao;
import com.examples.CollectionEx.utils.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class AverageAgeOfEmployees {
    public static void main(String args[]){
       List<Employee> employeeList =EmployDao.getEmployees();
   int test = employeeList.stream().collect(Collectors.averagingDouble(e->e.getAge())).intValue();
   System.out.println(test);
    }
}
