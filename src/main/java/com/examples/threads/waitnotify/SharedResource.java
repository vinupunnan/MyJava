package com.examples.threads.waitnotify;

public class SharedResource {
    private String message;
    private boolean hasMessage;

    public synchronized void produceMessage(String message){
        this.message = message;
        hasMessage =true;
        System.out.println("Producer produced the message");
        notify();

    }

    public void consumeMessage(String message){

    }

}
