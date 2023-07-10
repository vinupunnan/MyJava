package com.examples.threads.executers;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FirstClassWithExceuter {
    public static void main(String arg[]){
        ExecutorService executerService = Executors.newFixedThreadPool(10);
        for(int i=0;i<100;i++) {
            executerService.execute(new ThreadOne());
        }
    }

}
