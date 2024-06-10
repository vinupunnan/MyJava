package com.examples.array.geeks;

public class SubArrayWithGivenSum {
    public static void main(String args[]){
       // N = 10, S = 15
      int[]   arr= {1,2,3,4,5,6,7,8,9,10};
       int s = 15;


      for(int i= 0 ;i < arr.length ;i++){
          int sum = arr[i];
          for(int j=i+1 ;j<arr.length ;j++){
              sum = sum+ arr[j];
              if(sum == s){
                  //System.out.println(i +"---" +j);
                  for(int k = i ;k<=j ;k++){
                      System.out.print(arr[k]);

                  }
                  System.out.println("========");
                  break;
              }
          }


      }


    }
}
