package com.examples.CollectionEx.utils;

import com.examples.CollectionEx.utils.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

public class EmployDao {
    public static List<Employee> getEmployees(){
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(111, "Jiya Brein", 33, "Female", "HR", 2011, 25.0, Arrays.asList("a","b")));
        employeeList.add(new Employee(122, "Paul Niksui", 33, "Male", "Sales And Marketing", 2015, 13500.0,Arrays.asList("c","d")));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0,Arrays.asList("e","f")));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0,Arrays.asList("g","h")));;
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0,Arrays.asList("i","j")));
        employeeList.add(new Employee(166, "Arif  Hussain", 43, "Male", "Security And Transport", 2016, 25.0,Arrays.asList("k","l")));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0,Arrays.asList("m","n")));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0,Arrays.asList("o","p")));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0,Arrays.asList("q","r")));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5,Arrays.asList("s","t")));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 1570000.0,Arrays.asList("u","v")));
        employeeList.add(new Employee(222, "Nitin Joshi", 70, "Male", "Product Development", 2016, 28200.0,Arrays.asList("w","x")));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0,Arrays.asList("y","z")));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5,Arrays.asList("cc","dd")));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0,Arrays.asList("aa","bb")));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0,Arrays.asList("ee","ff")));
        employeeList.add(new Employee(277, "Raj  Kulkkarni", 75, "Male", "Product Development", 2008, 45000.0,Arrays.asList("gg","hh")));
        employeeList.add(new Employee(277, "Maumula  Santosh", 30, "Male", "Devops", 2008, 37000.0,Arrays.asList("ii","jj")));
        return employeeList;

    }

    public static LinkedHashMap getEmployeesAsMap(){
        LinkedHashMap lhm = new LinkedHashMap();
        List<Employee> employees = getEmployees();
        int i =1;
        for(Employee employee :employees){
            lhm.put(i,employee);
            i++;
        }
        return lhm;
    }
}
