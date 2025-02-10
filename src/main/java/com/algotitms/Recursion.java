package com.algotitms;

public class Recursion {

    public static void main(String[] args) {
        System.out.println("Iterate approach");
        int n = 5;
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        System.out.println( "----------------");
        System.out.println("Recurent approach");
        printDigit(1);
    }

    public static void printDigit(int n) {
        //base case
        if (n == 6) {
            return;
        }
        // recurent case
        System.out.println(n);
        printDigit(n+1);
    }
}
