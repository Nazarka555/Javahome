package com.teleran.base.lesson6;

import java.util.Scanner;

/**
 * switch(expression){
 *     case 1:
 *     // code
 *     break;
 *
 *     case 2:
 *     //code
 *     break;
 *
 *     default;
 * }
 * в качестве выражения используеться цыфра , строка , enum
 */
public class SwitchCaseExample {
    public static void main(String[] args) {
        System.out.println("please input number");
        Scanner console = new Scanner(System.in);
        int data = console.nextInt();
        console.close();

        switch (data) {
            case 1:
                System.out.println("You wrote 1");
                break;
            case 3:
                System.out.println("You wrote 3");
                //
                break;
            case 2:
            case 4:
                System.out.println("You are best");
                //
                break;
            case 5:
            case 0:
                System.out.println("it is corner number");
                //
                break;
            default:
                System.out.println("you input from 0 to 5");

        }
    }
}
