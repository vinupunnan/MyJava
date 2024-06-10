package com.examples.array;

public class MaximumProfitPrgramme {
    public static void main(String args[]) {
        int[] arr = {2, 3, 5, 6, 7, 12, 1, 9, 6};
        int arrLength = arr.length;
        int maxProfit = 0;
      for(int i =0;i<arrLength ;i++ )  {
      for(int j =i+1 ;j<arrLength ;j++ ){

          int test =  arr[j]-arr[i];
          if(test>maxProfit){
              maxProfit =test;

          }
      }


      }
System.out.println(maxProfit);
    }
}
//
//        for (int i =arr.Vi    v; i ==0; i -- ){
//
//            6 -9
//            6 -1
//            6 -12
//             6 - 5
//
//             up to 2 and save the maximum
//
//9
//upto to 2
//if there is maximum replace maximum
//
//            int test = arr[i]-arr[i=1]    ;
//            if( test<=0){
//                maxcount =0 ;
//            }else if(test > maxcount){
//                maxcount = test;
//            }
//
//        }
//    }
//}
