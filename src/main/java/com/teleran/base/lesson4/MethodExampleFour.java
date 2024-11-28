package com.teleran.base.lesson4;

public class MethodExampleFour {

    public static void main(String[] args) {
        int one = 34;
        int two = 22;
        int result = calculateSum(one, two);
        System.out.println("Sum " + one + " and " + two + " = " + result );

    }

    private static int calculateSum(int numberOne , int numberTwo){
        int sum = numberOne + numberTwo;
        return sum;
    }
}
