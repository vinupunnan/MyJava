package com.examples.annotations;

@VeryImportant
public class Dog {
    @ImportantString
    String name;
    String colour;
    int age;
        String breed;

    public Dog(String name, String colour, int age, String breed) {
        this.name = name;
        this.colour = colour;
        this.age = age;
        this.breed = breed;
    }

    @RunImmediately(times = 2)
    public void bark(){
        System.out.println("BOWWW");
    }

    public void eat(){
        System.out.println("Eating Tasty Food");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
