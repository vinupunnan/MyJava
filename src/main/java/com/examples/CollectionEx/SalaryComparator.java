package com.examples.CollectionEx;



import com.examples.CollectionEx.utils.Employee;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getSalary() > o2.getSalary()) {
            return 0;
        }
        return 1;
    }



}
