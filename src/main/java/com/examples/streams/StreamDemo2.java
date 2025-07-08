package com.examples.streams;

import com.examples.CollectionEx.utils.EmployDao;
import com.examples.CollectionEx.utils.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo2 {
    public static void main(String args[]){
        List<Employee> employeeList = EmployDao.getEmployees();
       // employeeList.stream().collect(Collectors.groupingBy(e->e.getGender(),Function.identity()));
//    Map<String ,Long > test =    employeeList.stream().collect(Collectors.groupingBy(e->e.getGender(),Collectors.counting()));
//  List<Employee>  empList =  employeeList.stream().filter(e-> e.getGender().equals("Male")).collect(Collectors.toList());
//    System.out.println(test);
//    System.out.println(empList.size());
//    // Query 15 : Who is the oldest employee in the organization? What is his age
//        //		// and which department he belongs to?

 Optional<Employee> opt = employeeList.stream().collect(Collectors.maxBy(Comparator.comparingInt(e->e.getAge())));
        Map<Boolean, List<Employee>> partitionEmployeesByAge=
                employeeList.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 25));
        System.out.println(partitionEmployeesByAge);

 Employee emp =opt.get();
 System.out.println(emp.toString());

    }
}
