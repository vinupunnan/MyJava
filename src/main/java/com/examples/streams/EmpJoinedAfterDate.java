package com.examples.streams;

import com.examples.CollectionEx.utils.EmployDao;
import com.examples.CollectionEx.utils.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class EmpJoinedAfterDate {
    public static void main(String args[]) {
        List<Employee> employList = EmployDao.getEmployees();
     List testList =   employList.stream().filter(e->e.getYearOfJoining()>2010).collect(Collectors.toList());
     System.out.println(testList);

    }
}
