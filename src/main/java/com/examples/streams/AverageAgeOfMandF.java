package com.examples.streams;

import com.examples.CollectionEx.utils.EmployDao;
import com.examples.CollectionEx.utils.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AverageAgeOfMandF {
    public static void main(String args[]){
        List<Employee> employees = EmployDao.getEmployees();
     employees.stream().collect(Collectors.groupingBy(c->c.getGender(),Collectors.averagingDouble(c-> c.getAge())));



        Map<String,Double> tst=   employees.stream().collect(Collectors.groupingBy(e->e.getGender(),Collectors.averagingDouble(e->e.getAge())));
    System.out.println(tst);
    }
}
