package com.teleran.base.lesson11;

public class CarApp {

    public static void main(String[] args) {
        // Объекты в Джава создаем через строку new
        // Созданее обїект на основании класа
        Car carOne = new Car();// #FFEEOO
        Car carTwo = new Car();// #BBDDAA
        // єто два разных объекта, анолагочно двум разным авто на парковки

        carOne.serialNumber = "A47GHF8298";
        carOne.color = "black";

        carTwo.serialNumber = "SU2YFHWQH8";
        carTwo.color = "Red";
        // У каждого создаваемого объекта , есть своя собвственная копия всех характеристик
        // этого объекта , со своими собственными значениями

        String serialNumberOne= carOne.serialNumber;
        String serialNumberTwo = carTwo.serialNumber;

        System.out.println("Serial number car one is " +serialNumberOne);
        System.out.println("Serial number car two is " +  serialNumberTwo);

        System.out.println("color one is " + carOne.color + " number one is " + carOne.serialNumber);
        System.out.println("color two is " + carTwo.color + " number two is " + carTwo.serialNumber);

        Car carThree = new Car("284fhsuhef" , "white");
        System.out.println("car three " + carThree.color + " " + carThree.serialNumber );

        Car carFour = new Car("vskbkdbv" , "pink");
        System.out.println("car four = " + carFour.serialNumber);

        carFour.drive();
        carOne.drive();
        carTwo.drive();
        carThree.drive();
    }
}
