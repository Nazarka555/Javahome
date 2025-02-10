package com.teleran.base.lesson9;

/**
 * линейний поиск  - поиск елементов внутри массива
 * Это простой перебор всех елементов массива и сравнение каждого
 * эдемента с имкаемым
 */
public class LinerSearchExample {

    public static void main(String[] args) {


        int[] array = {3, 4, 5, 6, 9, 4, 2, 88, 5, 3, 5, 7, 8, 0, 12};
        int target = 88;

        boolean b = linearSearch(array, target);
        System.out.println(target + " " + b);

        target = 50;
        boolean b1 = linearSearch(array, target);
        System.out.println(target + " " + b1);
    }

    public static boolean linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            if (temp == target) {
                return true;
            }
        }
        return false;
    }
}
