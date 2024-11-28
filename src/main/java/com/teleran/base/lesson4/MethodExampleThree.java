package com.teleran.base.lesson4;

public class MethodExampleThree {
    public static void main(String[] args) {
        String str = getGreetings();
        System.out.println(str);
        int code = getCode();
        System.out.println(code);
    }

    public static String getGreetings(){
        String text = "Hello Hello Hello";
        return text;
    }

    public static int getCode(){
        return 765;
    }
}
