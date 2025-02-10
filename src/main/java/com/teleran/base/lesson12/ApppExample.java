package com.teleran.base.lesson12;


public class ApppExample {
    public static void main(String[] args) {
        int ticketPriceOne = 5;
        int ticketPriceTwo = 10;
        int sum = getSum(ticketPriceTwo, ticketPriceOne);
        int people = 5;
        int fullPrice = getFullPrice(sum , people);
        System.out.println(sum * people);
    }

    public static int getSum(int a, int b) {
        int sum = a + b ;
        System.out.println("sum a = " + a  + " + " + " b =  " + b + " = " + sum );
        return sum;
    }

    public static int getFullPrice(int tripPrice , int numberOfPerson){
        return tripPrice * numberOfPerson;
    }
}
