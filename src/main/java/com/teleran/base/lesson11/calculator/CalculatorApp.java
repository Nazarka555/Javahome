package com.teleran.base.lesson11.calculator;

public class CalculatorApp {
    public static void main(String[] args) {

       Calculator endgCalc = new Calculator("Eng");
       endgCalc.printSum(5,3);
       endgCalc.switchLanguage();
       endgCalc.printSum(6,4);
    }

    /**public static void printSum(int a, int b) {
        System.out.println("Sum is :" + (a + b));
    }

    public static void printSub(int a, int b) {
        System.out.println("Sub is :" + (a - b));
    }
     **/
}
