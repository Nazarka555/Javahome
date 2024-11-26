package com.teleran.base.lesson3;

public class Variables {

    int instansVar = 11;

    static int staticvar = 10;

    public static void main(String[] args) {
        int localVar = 12;
        staticvar += 1;
        localVar += 1;
        System.out.println(staticvar);
        System.out.println(localVar);
        Print();
    }

    public static void Print(){
        System.out.println(staticvar);
    }
}
