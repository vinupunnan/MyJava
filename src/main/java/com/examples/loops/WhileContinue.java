package com.examples.loops;

public class WhileContinue {
    public static void main(String args[]){
        int i =0 ;
        int sum =0;
        while(i<= 100 ){
            if(i%3 != 0){
                sum =sum+i;
            }
            i = i+1;

        }
System.out.println("Sum is " +sum);
    }

}
