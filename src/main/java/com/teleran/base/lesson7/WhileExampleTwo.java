package com.teleran.base.lesson7;

import java.util.Scanner;

public class WhileExampleTwo {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String data = null;

        while (!"y".equals(data) && !"n".equals(data)) {
            System.out.println("please input y or n");
            data = console.next();
            if ("y".equals(data)) {
                System.out.println("let's go");
            }
            if ("n".equals(data)) {
                System.out.println("bye");
            }
        }
    }
}
