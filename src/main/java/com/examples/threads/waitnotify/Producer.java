package com.examples.threads.waitnotify;

public class Producer implements  Runnable{
    private SharedResource sharedResource;

    Producer (SharedResource sharedResource){
        this.sharedResource=sharedResource;
    }

    @Override
    public void run() {
    String[] message = {"Message 1","Message 2","Message 3"};
    for(int i =0;i<message.length;i++) {
        sharedResource.produceMessage(message[i]);
    }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
