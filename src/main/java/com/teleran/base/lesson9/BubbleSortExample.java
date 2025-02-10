package com.teleran.base.lesson9;

import java.util.Arrays;

public class BubbleSortExample {

    public static void main(String[] args) {
        int[] array = {35,6,4,5,8,1,50};
        System.out.println(Arrays.toString(array));

        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < (array.length - 1 - j); i++) {
                if (array[i] >= array[i + 1]) {
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
