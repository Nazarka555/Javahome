package com.teleran.base.lesson11;

/**
 * Для создаваемого объекта на основании этого класа , типом переменной
 * в которой , будет храниться наш объект , и будет тип этого класса
 *
 * Конструктор обязан быть в каждом классе , если никаких конструкторов нет,
 * то компилятор сам его создаст , но только если никаких нет!!!
 */
public class Car {
    // Элементы данных (набо полей это состояние объекта)
    //Свойсва объекта. Характеристики объекта.поля класа - это все одно и тоже

    String serialNumber;

    String color;


    //Конструктор

    public Car() {
        System.out.println("hi i am car ");
    }

    public Car(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Car(String serialNumber, String color) {
        this.serialNumber = serialNumber;
        this.color = color;
    }

    public void drive(){
        System.out.println("Car with color " + this.color
                + " and serial number "+ this.serialNumber+ "is driving");
    }
}
