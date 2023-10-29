package com.examples.streams;

import com.examples.basic.Employee;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamDemo {
    static List<Employee> employeeList = new ArrayList<Employee>();
    public static void main(String args[]) {
        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25.0));
        employeeList.add(new Employee(122, "Paul Niksui", 33, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Arif  Hussain", 43, "Male", "Security And Transport", 2016, 25.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 1570000.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 89, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
       employeeList.add(new Employee(277, "Raj  Kulkkarni", 40, "Male", "Product Development", 2008, 45000.0));
        employeeList.add(new Employee(277, "maumula  Santosh", 30, "Male", "Devops", 2008, 37000.0));

       Long totalCount = employeeList.stream().count();
        System.out.println(totalCount);
      Long maleEmployees=   employeeList.stream().filter(t->t.getGender().equals("Male")).count();
      System.out.println(maleEmployees);
     Long femaleEmployees =   employeeList.stream().filter(t->t.getGender().equals("Female")).count();
        System.out.println(femaleEmployees);

      Map<String ,Long> employee =employeeList.stream().collect(Collectors.groupingBy(e->e.getGender(),Collectors.counting()));

      System.out.println(employee.toString());
}

    public static List<Employee> getEmployeeList() {
        return employeeList;
    }

    public static void setEmployeeList(List<Employee> employeeList) {
        StreamDemo.employeeList = employeeList;
    }
}
