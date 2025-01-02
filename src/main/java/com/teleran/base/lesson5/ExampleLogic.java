package com.teleran.base.lesson5;

public class ExampleLogic {

    public static void main(String[] args) {
        int number = 7;
        if (number >= 5 && number <= 10) {
            System.out.println("your number from 5 to 10");
        }
        number = 4;
        if (number >= 5 || number <= 10) {
            System.out.println("your number more than 5 , or less than to 10");
        }
        boolean isCorrect = false;
        if (!isCorrect){
            System.out.println("is correct");
        }else {
            System.out.println("is incorrect");
        }
    }
}
