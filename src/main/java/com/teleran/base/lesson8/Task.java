package com.teleran.base.lesson8;

public class Task {

    public static void main(String[] args) {
        int [] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        for (int i = 0; i <array.length ; i++) {
            array[i] *= -1;
            System.out.println(array[i]);
        }
    }
}
