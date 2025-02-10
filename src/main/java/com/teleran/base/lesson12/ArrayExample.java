package com.teleran.base.lesson12;

public class ArrayExample {
    public static void main(String[] args) {
        int[] ints = {7, 4, 6, 7, 3, 1, 10, 3};
        TaskOne taskOne = new TaskOne();
        System.out.println(taskOne.getMax(ints));

    }

    public int getMax(int[] array) {

        if (array == null || array.length == 0) {
            return -1;
        }

        int currentMax = array[0];
        for (int i = 1; i < array.length; i++) {
           currentMax = Math.max(currentMax , array[i]);
        }
        return currentMax;
    }
}
