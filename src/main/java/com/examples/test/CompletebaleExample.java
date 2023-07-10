package com.examples.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class CompletebaleExample {
    public static void main (String args[]) throws ExecutionException, InterruptedException {
        //CompletableFuture<`List` <Employee>> ef =  CompletableFuture.supplyAsync(()-> getTest("papa"));
    //List<Employee> employeeList = ef.get();

//     List<Employee> finalList =  employeeList.stream().filter(e -> e.getName().equalsIgnoreCase("Tinod")).collect(Collectors.toList());
//    System.out.println(finalList.size());
//     System.out.println(  finalList.get(0).getName());
    }

    public static List  getTest(String str) {

        List<Employee> employeeList = new ArrayList ();

        Employee emp = new Employee( "Vinod", "vxp110","arch" );
        Employee emp2 =  new Employee( "Tinod", "txp110","Dev" );
        Employee emp3 = new Employee( "Sunod", "sxp110","Test" );
        employeeList.add(emp);
        employeeList.add(emp2);
        employeeList.add(emp3);
        return employeeList;
    }
}
