package com.examples.CollectionEx.functional;

import com.examples.CollectionEx.utils.EmployDao;
import com.examples.CollectionEx.utils.Employee;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerExample2 {
    public static void main(String args[]){
        ArrayList<Employee> employeeList = (ArrayList<Employee>) EmployDao.getEmployees();

   Consumer<Employee> c4=    o ->
            System.out.println(o.getDepartment());


        Consumer<Employee> c = (e)->System.out.println(e.getName());;
        employeeList.stream().forEach(c4);

    }

}
