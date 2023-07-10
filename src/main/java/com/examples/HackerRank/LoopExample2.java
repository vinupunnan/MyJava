package com.examples.HackerRank;

import java.util.Scanner;

public class LoopExample2 {
    public static void main(String[] args){

        //a+2aise0 xb
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0;i<t;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int x=0;
             for(int j=0;j<n;j++){
                 if(j ==0){
                  x = (int) (a + (Math.pow(2,j) * b));
                 }else{
                     x= (int) (x+ (Math.pow(2,j)*b));
                 }
                 System.out.print(x + " ");

             }
                  }
    }
}
