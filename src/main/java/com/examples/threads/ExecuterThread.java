package com.examples.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterThread {
    public static void main(String[] args){
        int coreCount =Runtime.getRuntime().availableProcessors();
     ExecutorService execService = Executors.newFixedThreadPool(coreCount);
     for(int i =0;i<1000;i++){
         execService.execute(new MyTask());
     }

    }
}
