package com.examples.compare2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparionMain {
    public static void main(String args[])throws Exception{

        List<Laptop> laptops = new ArrayList();
        Laptop dell = new Laptop("DELL",1000, 625);
        laptops.add(dell);
        Laptop lenova = new Laptop("lenova",999, 800);
        laptops.add(lenova);
        Laptop apple = new Laptop("apple",1050, 900);
        laptops.add(apple);
        Collections.sort(laptops);
        System.out.println(laptops);
    }
}
