package com.teleran.base.lesson11;

public class Dog {

    String name;

    int age;

    int height;

    String breed;

    public Dog(String name, int age, String breed, int height) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.height = height;
    }

    public void print(){
        System.out.println("Dog " + name + " " + age + " " + height + " " + breed);
    }

}
