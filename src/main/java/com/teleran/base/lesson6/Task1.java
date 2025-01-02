package com.teleran.base.lesson6;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        System.out.println("input some day in a week");
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();

        switch (str){
            case "monday" -> System.out.println("hard day");
            case "tuesday", "wednesday", "thursday" -> System.out.println("just normale day");
            case "friday" -> System.out.println("happy day");
            case "saturday", "sunday" -> System.out.println("day to have rest");
            default -> System.out.println("just try again");
        }
    }
}
