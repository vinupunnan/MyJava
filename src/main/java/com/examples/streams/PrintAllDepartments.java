package com.examples.streams;

import com.examples.CollectionEx.utils.EmployDao;
import com.examples.CollectionEx.utils.Employee;

import java.util.List;

public class PrintAllDepartments {
    public static void main(String args[]){
        List<Employee> employList = EmployDao.getEmployees();
                            //forEachArgumet is a consumer
        employList.stream().forEach(e-> printDept(e.getDepartment()
        ));
    }

    private static void printDept(String department) {
        System.out.println(department);
    }
}
