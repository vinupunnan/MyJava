package com.examples.test;

import java.util.ArrayList;
import java.util.List;

public class CommonHelper {
    public static List getEmpList1() {

        List<Employee> employeeList = new ArrayList();

        Employee emp = new Employee( "Vinod", "vxp110","arch" );
        Employee emp2 =  new Employee( "Tinod", "txp110","Dev" );
        Employee emp3 = new Employee( "Sunod", "sxp110","Test" );
        employeeList.add(emp);
        employeeList.add(emp2);
        employeeList.add(emp3);
        return employeeList;
    }

    public static List getEmpList2() {

        List<Employee> employeeList = new ArrayList();

        Employee emp = new Employee( "Vinod", "vxp110","arch" );
        Employee emp2 =  new Employee( "Ramji", "Ram222","Dev" );
        Employee emp3 = new Employee( "Rukon", "Ruk110","Test" );
        employeeList.add(emp);
        employeeList.add(emp2);
        employeeList.add(emp3);
        return employeeList;
    }

    public static List getEmpList3() {

        List<Employee> employeeList = new ArrayList();

        Employee emp = new Employee( "Vinod", "vxp110","arch" );
        Employee emp2 =  new Employee( "Madanji", "Mad222","Dev" );
        Employee emp3 = new Employee( "Subban", "Sub110","Test" );
        employeeList.add(emp);
        employeeList.add(emp2);
        employeeList.add(emp3);
        return employeeList;
    }

    public static List getEmpList4() {

        List<Employee> employeeList = new ArrayList();

        Employee emp = new Employee( "Vinod", "vxp110","arch" );
        Employee emp2 =  new Employee( "Kusan", "Kus222","Dev" );
        Employee emp3 = new Employee( "Raghu", "Rag110","Test" );
        employeeList.add(emp);
        employeeList.add(emp2);
        employeeList.add(emp3);
        return employeeList;
    }
}
