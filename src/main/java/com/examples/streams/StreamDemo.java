package com.examples.streams;

import com.examples.CollectionEx.utils.EmployDao;
import com.examples.CollectionEx.utils.Employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String args[]) {
        List<Employee> employeeList = EmployDao.getEmployees();

        // Query 1 : How many male and female employees are there in the organization?
        Map<String, Long> test = employeeList.stream().collect(Collectors.groupingBy(a -> a.getGender(), Collectors.counting()));
        System.out.println(test);
        // Query 2 : Print the name of all departments in the organization?
        employeeList.stream().forEach(e -> System.out.println(e.getDepartment()));
        System.out.println(" =======");
        employeeList.stream().map(e -> e.getDepartment()).distinct().forEach(e -> System.out.println(e));

        System.out.println("\n");
        // Query 3 : What is the average age of male and female employees?
        Map<String, Double> ageMap = employeeList.stream().collect(Collectors.groupingBy(e -> e.getGender(), Collectors.averagingDouble(e -> e.getAge())));
        System.out.println(ageMap);

        System.out.println("\n");
        // Query 4 : Get the details of highest paid employee in the organization?
        Optional<Employee> emp = employeeList.stream().collect(Collectors.maxBy(
                Comparator.comparingDouble(e -> e.getSalary())));

        // Query 5 : Get the names of all employees who have joined after 2015?

        System.out.println(employeeList.stream().filter(e -> e.getYearOfJoining() > 2015).collect(Collectors.toList()));


    }
}
