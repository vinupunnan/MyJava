package com.examples.basic;

import java.util.*;

public class ListExamles {
    public static void main(String args[]){
UserObject u = new UserObject();
        //ArrayList<Integer> fromUiOrg  = u.getFromUi();
       // List<Integer> newList = new ArrayList<>(fromUiOrg);
        ArrayList<Integer> fromUi = new ArrayList<>(Arrays.asList(5,6,9));
        ArrayList<Integer> fromDb = new ArrayList<>(Arrays.asList(5,6,7));
        ArrayList<Integer> orginalListFromUI = new ArrayList<>(fromUi);
      //  ArrayList<Integer> orginalListFromDb = new ArrayList<>(fromDb);
        Map hm = new HashMap<>()  ;

        fromUi.removeAll(fromDb);
        System.out.println(fromUi);
        for(Integer i : fromUi){
            hm.put("Add",i);
        }


        System.out.println(orginalListFromUI);
        System.out.println(fromDb);
        fromDb.removeAll(orginalListFromUI);
        System.out.println(fromDb);
        for(Integer i : fromDb){
            hm.put("Del",i);
        }

System.out.println(hm);
    }
}
