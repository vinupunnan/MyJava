package com.examples.CollectionEx;

import com.examples.CollectionEx.utils.EmployDao;
import com.examples.CollectionEx.utils.Employee;
import com.examples.CollectionEx.utils.EmployeeMapCompare;

import java.util.*;

public class MapValueSortObject {
    public static void main(String args[]){

      LinkedHashMap<Integer, Employee> employMap  =    EmployDao.getEmployeesAsMap();
        List<Map.Entry<Integer,Employee>> mapList = new LinkedList<Map.Entry<Integer, Employee>> (employMap.entrySet());
        Collections.sort(mapList,new EmployeeMapCompare());
        System.out.println(mapList);
        LinkedHashMap<Integer, Employee> sortedMAp = new LinkedHashMap<>();

        for(Map.Entry<Integer,Employee> mp :mapList){
            sortedMAp.put(mp.getKey(),mp.getValue());
        }
        System.out.println(sortedMAp);
    }


}
