package com.teleran.base.lesson7;

import java.util.Scanner;

public class DoWhileExample {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean bb = true;

        while (bb) {
            System.out.println("Write 1 to start , 2 to load , 3 to print , 4 to exit");
            int number = console.nextInt();
            switch (number) {
                case 1 -> start();
                case 2 -> loading();
                case 3 -> result();
                case 4 -> bb = false;
            }
        }
    }
    public static void start() {
        System.out.println("start");
    }

    public static void loading() {
        System.out.println("load");
    }

    public static void result() {
        System.out.println("result");
    }

}
