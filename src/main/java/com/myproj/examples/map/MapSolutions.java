package com.myproj.examples.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class MapSolutions {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        Map<String, Integer> hm = new HashMap<String, Integer>();

        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            hm.put(name, phone);
            in.nextLine();
        }
        while (in.hasNext()) {
            //boolean flag = false;
            String s = in.nextLine();
//            for (Map.Entry<String, Integer> entry : hm.entrySet()){
//                if(entry.getKey().equals(s) && flag == false){
//                    System.out.println(entry.getKey() +"=" +entry.getValue());
//                    flag = true;
//                }
//            }
//            if(flag ==false){
//                System.out.println("Not Found");
//            }
if(hm.containsKey(s)){
    System.out.println(s+"=" +hm.get(s));
}else{
    System.out.println("Not Found");
}


      }



    }


}