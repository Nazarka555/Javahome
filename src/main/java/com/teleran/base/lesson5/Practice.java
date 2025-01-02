package com.teleran.base.lesson5;

/**
 * создаем 4 переменные 
 *
 */
public class Practice {

    public static void main(String[] args) {
        int a = 9, b = 15, c = 15, d = 44;
        if (a < b && b == c) {
            System.out.println("first logic were done");
        }
        if (a > b || c == d) {
            System.out.println("second logic were done");
        }
        if (a != b) {
            System.out.println("third logic were done");
        }else {
            System.out.println("nothing were done");
        }
    }
}
