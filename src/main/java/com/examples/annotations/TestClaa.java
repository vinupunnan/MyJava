package com.examples.annotations;
import java.util.Scanner;
import java.text.DecimalFormat;
public class TestClaa {
    public static void main(String args[]){
    Scanner num = new Scanner (System.in);
  //DecimalFormat fmt= new DecimalFormt("0.##");
    System.out.println("The second value is");
    int nandu = num.nextInt();

    int secondsToHour = nandu/3600 ;
    System.out.println(secondsToHour);
   int test = (nandu%3600);
   int monutes = test/60;
   System.out.println(monutes);
   System.out.println(test%60);

//    int secondsToMinutes = nandu/60 ;
//    System.out.println(secondsToMinutes);
//    int secondsToseconds= 1/1;




    }
}


