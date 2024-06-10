package com.examples.basic;

public class ClosestNumber {
    public static void main(String args[]){
        int a = -15;
        int b = 4;
        int ans = a/b;


        int closest = b*ans;
        int newClosest = closest+b;
        System.out.println("Closest" +closest);
        System.out.println("NewClosest" + newClosest);
       if ( Math.abs(newClosest-a) <= Math.abs(a-closest)){
           closest =newClosest;

       }
System.out.println(closest);





    }
}
