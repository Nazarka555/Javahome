package com.teleran.base.lesson5;

import java.util.Scanner;

public class Exampleif {

    public static void main(String[] args) {
        System.out.println("Please input number 1: ");
        Scanner console = new Scanner(System.in);
        int data = console.nextInt();

        if (data == 1){
            System.out.println("Your input is correct!");
        }
        System.out.println("Bye!");
        console.close();
    }
}
