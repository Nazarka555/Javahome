package com.teleran.base.lesson5;

import java.util.Scanner;

/**
 * auto format code : ctrl + alt + L
 */
public class ExampleElse {

    public static void main(String[] args) {
        System.out.println("Please input number 1: ");
        Scanner console = new Scanner(System.in);
        int data = console.nextInt();

        if (data == 1) {
            System.out.println("Your input correct!");
        } else {
            System.out.println("your input incorrect");
        }

        console.close();
    }
}
