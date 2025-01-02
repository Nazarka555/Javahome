package com.teleran.base.lesson5;

import java.util.Scanner;

public class ExampleNestedIf {

    public static void main(String[] args) {
        System.out.println("Please input number under 10: ");
        Scanner console = new Scanner(System.in);
        int data = console.nextInt();

        if (data <= 10) {
            System.out.println("your input correct");
            if ((data % 2) == 0){
                System.out.println("your number is even");
            }else {
                System.out.println("your number is odd");
            }
        } else {
            System.out.println("your input incorrect");
        }

        console.close();
    }
}
