package com.teleran.base.lesson4;

/**
 * метод - кусочек кода котовый можно вызывать сколько угодно раз
 * методы позволяют переиспользовать один и тот же код
 */
public class MethodCallExampleTwo {

    public static void main(String[] args) {
    printNumber(5);
    printNumber(10);
    printNumber(3);

    printSum(10,13);


    }

    private static void printNumber(int number){
        System.out.println("our number is " + number);
    }
    private static void printSum(int a , int b){
        System.out.println("our number is " + (a + b));
    }
}
