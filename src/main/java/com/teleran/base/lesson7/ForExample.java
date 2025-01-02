package com.teleran.base.lesson7;

import java.util.Map;
import java.util.Scanner;

/**
 * цыкл - это конструкция,
 * которая обеспечивает многократное выполнения кода ,
 * который помещен в эту конструкцию
 *
 * for
 * while
 * do while
 * foreach(вариация цикла for)
 *
 *break - немедленно прерывает выполнение цыкла
 *continue - пропускаед код , который находиться внутри цикла ,
 * после этого оператора и переходит к следуещей иттерации
 */
public class ForExample {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please input your number");
        int number = console.nextInt();
        print(number);
        System.out.println("here start second method ");
        printTwo(number);
        System.out.println("here start third method ");
        printThree(number);
    }

    public static void print(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }

    public static void printTwo(int number) {
        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void printThree(int number){
        for (int i = number; i >= 0 ; i--) {
            System.out.println(i);
        }
    }
}
