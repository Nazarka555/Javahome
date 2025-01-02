package com.teleran.base.lesson10;

import java.util.Scanner;

public class Practic {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        String str1 = console.nextLine();

        String strnew = makeTogether(str,str1);
        System.out.println(strnew);

    }
    public static String makeTogether(String str ,String str1){
        StringBuilder sb = new StringBuilder();
        sb.append(str).append(str1);
        sb.reverse();

        return sb.toString();
    }
}
