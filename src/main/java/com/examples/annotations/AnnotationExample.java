package com.examples.annotations;


import com.examples.optionals.Cat;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AnnotationExample {
    public static void main(String args[]) throws Exception {
        Dog dog = new Dog("chakki","brown",6,"Pomerinian");
        Cat myCat = new Cat("kittu","white");
       if( dog.getClass().isAnnotationPresent(VeryImportant.class)){
           System.out.println("This is very important");
       }else{
           System.out.println("This is Not important");
       }

       for(Method method :dog.getClass().getDeclaredMethods()){
           if(method.isAnnotationPresent(RunImmediately.class)){
               RunImmediately runImmediately = method.getAnnotation(RunImmediately.class);
             for(int i =0;i<runImmediately.times();i++){
                 method.invoke(dog);
             }

           }
       }

     for(Field field : dog.getClass().getDeclaredFields()){
         if(field.isAnnotationPresent(ImportantString.class)){
            String str = (String) field.get(dog);
            System.out.println("hello" +str);
         }

     }
    }
}