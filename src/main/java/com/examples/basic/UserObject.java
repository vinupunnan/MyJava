package com.examples.basic;

import java.util.ArrayList;
import java.util.Arrays;

public class UserObject {

    public  ArrayList<Integer> fromUi = new ArrayList<>(Arrays.asList(7,8));

    public ArrayList<Integer> getFromUi() {
        return fromUi;
    }

    public void setFromUi(ArrayList<Integer> fromUi) {
        this.fromUi = fromUi;
    }

    public ArrayList<Integer> getFromDb() {
        return fromDb;
    }

    public void setFromDb(ArrayList<Integer> fromDb) {
        this.fromDb = fromDb;
    }

    public   ArrayList<Integer> fromDb = new ArrayList<>(Arrays.asList(5,6,7));

}

