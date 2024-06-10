package com.examples.demo;

public class TestDemo {
    public static void main(String args[]){
        String inputString = "applePie";
        String[] inputArray = inputString.split("");

        for(int i =0;i< inputArray.length ;i++){
            int count =0;
            for(int j=i+1;j< inputArray.length;j++){
                if(inputArray[i].equalsIgnoreCase(inputArray[j])){
                    count =  count ++;
                }

            }
            System.out.println("The number" +inputArray[i] + "The count"+count);
        }




    }
}
