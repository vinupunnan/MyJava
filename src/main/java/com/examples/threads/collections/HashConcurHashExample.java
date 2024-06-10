package com.examples.threads.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashConcurHashExample {
    private static final int NUM_THREADS = 5;

    private static final int NUM_ELEMENTS = 100000;

    public static void main(String args[]) throws InterruptedException {
        HashMap hm = new HashMap();
        testThread(hm);
        ConcurrentHashMap hm2 = new ConcurrentHashMap();
        testThread(hm2);
    }

    private static void testThread(Map map) throws InterruptedException {
        Thread[] threads = new Thread[NUM_THREADS];
        for (int i = 0; i < NUM_THREADS; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < NUM_ELEMENTS; j++) {
                    map.put(j, "Value-" + j);
                }
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        // Print the size of the map
        System.out.println("Map size: " + map.size());
    }
}