package com.examples.streams;

import com.examples.CollectionEx.utils.EmployDao;
import com.examples.CollectionEx.utils.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class HighestPaidEmployee {
    public static void main (String args[]){
        List<Employee> employeeList = EmployDao.getEmployees();
       Optional<Employee> opt = employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(e->e.getSalary())));
       Employee e = opt.get();
       System.out.println(e.getName());
        System.out.println(e.getSalary());
    }
}
