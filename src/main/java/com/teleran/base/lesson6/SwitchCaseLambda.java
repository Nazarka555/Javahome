package com.teleran.base.lesson6;

import java.util.Scanner;

/**
 *switch(expression){
 *     case 1 -> // код для выполнения expression == 1;
 *
 *     case 3 -> {
 *               // код для выполнения expression == 3;
 *                // код для выполнения expression == 3;
 *                 // код для выполнения expression == 3;
 *
 *     }
 *
 *}
 */

public class SwitchCaseLambda {

    public static void main(String[] args) {
        System.out.println("please input number");
        Scanner console = new Scanner(System.in);
        int data = console.nextInt();
        console.close();

        switch (data) {
            case 1 -> System.out.println("You wrote 1");
            case 3 -> System.out.println("You wrote 3");
            case 2, 4 -> System.out.println("You are best");
            case 5, 0 -> System.out.println("it is corner number");
            default -> System.out.println("you input from 0 to 5");
        }
    }
}
