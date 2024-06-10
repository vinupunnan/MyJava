package com.examples.strings;

import com.examples.CollectionEx.utils.Employee;
import com.examples.basic.SalarDet;

import java.util.HashMap;
import java.util.Map;

public class OverRideEqualDemo {
    public static void main(String args[]){
        Employee emp1 = new Employee(1234);
        Employee emp2 = new Employee(1234);
        Map<Employee,SalarDet> employeeMap = new HashMap<Employee, SalarDet>();
        employeeMap.put(emp1,new SalarDet(1000.00));
        employeeMap.put(emp2,new SalarDet(3000.00));
        System.out.println(employeeMap);

    }
}
