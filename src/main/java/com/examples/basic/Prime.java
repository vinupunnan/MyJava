package com.examples.basic;

public class Prime {

    public static void main( String args[]){

        for(int i =2;i<20;i++){
         boolean flag =  false;
       for(int j=2 ;j<= i/2; j++) {
               if(i%j == 0){
                  flag =true;
                  break;
               }

            }

            if(flag == false){
System.out.println(i);
            }

        }


    }
}
