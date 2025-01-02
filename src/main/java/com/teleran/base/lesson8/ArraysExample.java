package com.teleran.base.lesson8;

/**
 * Масив это набр елементов , одинакового типа , расположеного в памяти
 * друг за другом.
 * <type> [] <name> = new <type>[size;]
 *
 *
 */
public class ArraysExample {

    public static void main(String[] args) {
       int [] array = new int[4];//обявления переменной и выделяемой памяти

       int [] ints; // объявления переменой массива
       ints = new int[5]; // выделение места под массив в оперативной памяти

        array[0] = 5; // поместили 5 в ячейку с индксом 0
        array[3] = 7;
        // 0  1  2  3
        // | 5 | | 0 | | 0 | | 7 |
        int temp = array[0];

        System.out.println(temp);

        int [] arrayOne = {1,2,3,4,5,6,7,8,9};
        System.out.println("Lengs of arrayOne = "+ arrayOne.length);
        for (int i = 0; i < arrayOne.length; i++) {
            System.out.print(arrayOne[i] + " ");
        }
    }
}
