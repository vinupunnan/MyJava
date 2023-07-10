package com.examples.test;

import java.util.*;
import java.util.concurrent.CompletableFuture;

public class CompletableExample2 {
    public static void main(String args[]) throws Exception {
        CompletableFuture<List<Employee>> future1 = CompletableFuture.supplyAsync(() -> CommonHelper.getEmpList1());
        //List<Employee> emp1 = future1.get();
        CompletableFuture<List<Employee>> future2 = CompletableFuture.supplyAsync(() -> CommonHelper.getEmpList2());
        //  List<Employee> emp2 = future1.get();
        CompletableFuture<List<Employee>> future3 = CompletableFuture.supplyAsync(() -> CommonHelper.getEmpList3());
        //  List<Employee> emp3 = future1.get();
        CompletableFuture<List<Employee>> future4 = CompletableFuture.supplyAsync(() -> CommonHelper.getEmpList4());
        //  List<Employee> emp4 = future1.get();
List<Employee> masterList = new ArrayList<Employee>();
        List<CompletableFuture<List<Employee>>> list = new ArrayList();
        list.add(future1);
        list.add(future2);
        list.add(future3);
        list.add(future4);
        Iterator it = list.iterator();
        while(it.hasNext()){
            CompletableFuture future = (CompletableFuture) it.next();
            List<Employee> elist = (List<Employee>) future.get();
            masterList.addAll(elist);
        }

//
//        List<Employee>collect =  list.stream()
//                .flatMap(x -> {
//                    try {
//                         x.get().stream().map(employee -> employee).collect(toList());
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    } catch (ExecutionException e) {
//                        e.printStackTrace();
//                    }
//
//                    return null;
//                });

        System.out.println("hello" +masterList);
    }

}
//       try {
//
//
//
//        List<Employee> collect = list.stream()
//                .map(x -> {
//                    try {
//                        return x.get().stream().map(employee -> employee).collect(Collectors.toList());
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    } catch (ExecutionException e) {
//                        e.printStackTrace();
//                    }
//                    return null;
//                })
////
//                .collect(Collectors.toList());
//
//                )									 	// List<List<String>>
//                .flatMap(List::stream)					// List<String>
//                .collect(Collectors.toList());
//
//
//        collect.forEach(x -> System.out.println(x));
//
//               } catch (InterruptedException e) {
//                e.printStackTrace();
//            } catch (ExecutionException e) {
//                e.printStackTrace();
//            }
//            return null;
//            try {
//                return c.get().stream().collect(Collectors.toList());
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            } catch (ExecutionException e) {
//                e.printStackTrace();
//            }
//            return null;
//        }).collect(Collectors.toList());
//            CompletableFuture<Void> future5 = CompletableFuture.allOf(list.toArray(new CompletableFuture[list.size()]));
//            System.out.println("close");
//        /*
//List<Employee> f = future5.get();
//  List<Employee> employeeList =   Stream.of(emp1,emp2,emp3,emp4).flatMap(Collection::stream).collect(Collectors.toList());
//        System.out.println(employeeList.size());
//        List<Employee> unique = employeeList.stream()
//                .collect(collectingAndThen(toCollection(() -> new TreeSet<>(Comparator.comparingInt(Employee::getName))),
//                        ArrayList::new));
//  System.out.println(unique.size());
//        CompletableFuture<List<Employee>> f  =  Stream.of(future1, future2, future3)
//                .map(CompletableFuture::join).collect(CompletableFuture::new);
//
//
//            }.
//*/
   //     }


   //     }