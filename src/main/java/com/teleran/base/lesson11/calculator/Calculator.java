package com.teleran.base.lesson11.calculator;

public class Calculator {

    private String language;

    public Calculator(String language) {
        this.language = language;
    }

    public void printSum(int a, int b) {
        int sum = a + b;
        if ("Eng".equals(language)) {
            System.out.println("Sum :" + sum);
        }else{
            System.out.println("Adi " + sum);
        }
    }

    public void switchLanguage(){
        if ("Eng".equals(language)) {
            language = "De";
        }else {
            language = "Eng";
        }
    }

    public void printSub(int a, int b) {
        System.out.println("Sub is :" + (a - b));
    }
}
