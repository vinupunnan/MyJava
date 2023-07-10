package com.examples.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class TestThread {
    public static void main(String args[]) throws ExecutionException, InterruptedException {
        CompletableFuture<List<Employee>> cf = calculteAsync();
     List<Employee> employees =  cf.get();
     employees.stream().map(e->e.getName());
     System.out.println(employees);
    }

    private static CompletableFuture<List<Employee>> calculteAsync() {
        CompletableFuture<List<Employee>> completableFuture = new CompletableFuture<>();

       Employee emp = new Employee( "Vinod", "vxp110","arch" );
       Employee emp2 =  new Employee( "Tinod", "txp110","Dev" );
       Employee emp3 = new Employee( "Sunod", "sxp110","Test" );
        List employeeList = new ArrayList();

        Executors.newCachedThreadPool().submit(()->{

            try {
                Thread.sleep(20);
                employeeList.add(emp);
                employeeList.add(emp2);
                employeeList.add(emp3);
                completableFuture.complete( employeeList);

            }catch(Exception e){
                e.printStackTrace();
            }

            return null;

    });

        return completableFuture;
    }

}
