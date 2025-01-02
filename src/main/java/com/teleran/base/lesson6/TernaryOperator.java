package com.teleran.base.lesson6;

import java.util.Scanner;

/**
 * input = (expression) ? "helloy" : "bye";
 */
public class TernaryOperator {

    public static void main(String[] args) {
        System.out.println("1 - say helloy , 2 - say bye");
        Scanner console = new Scanner(System.in);
        int input = console.nextInt();
        System.out.println(getWordThernaryOperator(input));

    }

    public static String getWord(int input) {
        if (input == 1) {
            return "helloy";
        } else {
            return "bye";
        }
    }
    public static String getWordThernaryOperator(int input) {
       return input == 1 ? "helloy" : "bye";

    }

}
