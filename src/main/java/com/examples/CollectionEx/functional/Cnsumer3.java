package com.examples.CollectionEx.functional;

import com.examples.CollectionEx.utils.Employee;

import java.util.function.Consumer;

public class Cnsumer3 implements Consumer<Employee> {
    @Override
    public void accept(Employee o) {
        System.out.println(o.getDepartment());
    }
}
