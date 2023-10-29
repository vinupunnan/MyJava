package com.examples.ArrayListExamples;

import java.util.ArrayList;

public class CustomArrayList extends ArrayList{
    public boolean add(Object o) {
        if(this.contains(o)){
            return true;
        }else{
         return   super.add(o);

        }

    }
}
