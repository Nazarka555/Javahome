package com.teleran.base.lesson5;

import java.util.Scanner;

public class ExampleReturn {

    public static void main(String[] args) {
        System.out.println("Please input number under 5: ");
        Scanner console = new Scanner(System.in);
        int data = console.nextInt();
        checkNumber(data);
        System.out.println("Bye");

    }

    public static void checkNumber(int data) {
        if (data > 5) {
            return;
        }
            if ((data % 2) == 0) {
                System.out.println("your input is even");
            } else {
                System.out.println("your input is odd");
            }

    }
}
