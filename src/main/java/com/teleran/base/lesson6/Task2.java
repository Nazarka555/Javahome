package com.teleran.base.lesson6;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("write a day of a week");
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        switch (str){
            case "saturday" , "sunday" -> System.out.println("it's fry day");
            default -> System.out.println("it's not a fry day");
        }
        System.out.println(checkDay(str));
    }
    public static String checkDay(String str){
        return str.equals("saturday") || str.equals("sunday") ? "relax" : "work";
    }
}
