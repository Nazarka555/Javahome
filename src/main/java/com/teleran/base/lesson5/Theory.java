package com.teleran.base.lesson5;

import java.util.Scanner;

/**
 * if - если условие истина , то нужно что то сделать
 *
 * if-else - если условие истина , то нужно что то сделать,
 * иначе если условие ложь , то нужно сделаь что-то другое
 *
 * if-else-if - если условие истина , то нужно что то сделать,
 *  * иначе если условие ложь , то нужно сделаь что-то другое
 *  а етим другим будет еще одно условие
 *
 * nested if - внутри условия другое условие
 * instructiom return - внутри условия можно использовать оператор
 * возврата , что бы прервать выполнение кода условия
 */
public class Theory {

    public static class ExampleIfElseIf {

        public static void main(String[] args) {
            System.out.println("Please input number 1: ");
            Scanner console = new Scanner(System.in);
            int data = console.nextInt();

            if (data == 1) {
                System.out.println("your input is 1");
            } else if (data == 2) {
                System.out.println("your input is 2");
            } else if (data == 3) {
                System.out.println("your input == 3");
            } else if (data == 4) {
                System.out.println("your input == 4");
            } else if (data == 5) {
                System.out.println("your input == 5");
            } else {
                System.out.println("your number more than 5");
            }

            console.close();
        }
    }
}
