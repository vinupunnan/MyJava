package com.examples.threads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


class TestconcurrentException implements Runnable {
   // static  ArrayList<String> l = new ArrayList();
  static  List<String> synlist = Collections
            .synchronizedList(new ArrayList<String>());

        @Override
        public void run() {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
System.out.println("In Child thred");
            synlist.add("a");

        }
    public static void main(String args[])throws Exception {
        synlist.add("a");
        synlist.add("b");
        synlist.add("c");
        synlist.add("d");
        synlist.add("e");
        System.out.println("In Main thred");
        Runnable runnable = new TestconcurrentException();
        Thread t2 = new Thread(runnable);
        t2.start();
        Iterator it = synlist.iterator();
        while(it.hasNext()) {
//            if(it.next().equals("b")) {
//                Thread.sleep(100);
//                it.remove();
//            }


            String str = (String) it.next();
            System.out.println("Printing" +str);
            Thread.sleep(2000);


        }

    }
}
