package com.teleran.base.lesson3;

import java.io.BufferedReader;
import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("write your numbeer ");
        int number = console.nextInt();
        System.out.println("your input = " + number);

        System.out.print("Write your word: ");
        String wordfromuser = console.next();
        System.out.println("String length = " + wordfromuser.length());

        console.nextLine();
        System.out.println("Please write here what you want");
        String WordsFromUs = console.nextLine();
        System.out.println("Everything what you wrote = " +WordsFromUs);

        console.close();
    }
}
