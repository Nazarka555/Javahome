package com.teleran.base.lesson4.example;

public class CatApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Мурзик" , 5);
        System.out.println(cat.name + " "+ cat.age);
        Cat cat1 = new Cat(true , "ахуєл");
        System.out.println(cat1.bb + " " + cat1.str);
    }
}
