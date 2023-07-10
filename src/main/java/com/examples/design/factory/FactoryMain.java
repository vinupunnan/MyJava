package com.examples.design.factory;

public class FactoryMain {
    public static void main(String args[])throws Exception{

        ShapeFactory shapeFactory = new ShapeFactory();
       Shape shape1 = shapeFactory.getShape("Circle");
      shape1.draw();

        Shape square  = shapeFactory.getShape("Square");
        square.draw();
    }
}
