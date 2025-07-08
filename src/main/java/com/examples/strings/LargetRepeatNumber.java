package com.examples.strings;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LargetRepeatNumber {
    public static void main(String args[]){
        String str = "JavaaJ2eeAndroidHibernateJSPppppppppppppppppppppppppp";
        String[] stringArray = str.split("");
        System.out.println(Arrays.toString(stringArray));
        List stringList = Arrays.asList(stringArray);
    Map<String,Long> map = (Map<String, Long>)
            stringList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        Set<Map.Entry<String, Long>> testSet =  map.entrySet();
       Iterator it = testSet.iterator();
       long max =0 ;
       String maxRep ="";
       while(it.hasNext()){
           Map.Entry<String ,Long> me = (Map.Entry) it.next();

if(me.getValue()>max){
    max= me.getValue();
    maxRep =me.getKey();
}

           }
System.out.println(maxRep);
       }
    }

