package com.examples.threads.executers;

public class FirstClass {
    public static void main (String args[]){
        // t.run();
        System.out.println("I m in main thread");
for(int i =0 ;i<100;i++) {
    Thread t = new Thread(new ThreadOne());
    t.start();
}

    }

}
