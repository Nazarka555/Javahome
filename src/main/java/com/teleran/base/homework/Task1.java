package com.teleran.base.homework;

import java.util.Scanner;

/**
 *  1 уровень сложности: Дан массив размера  n-1,
 *  содержащий только различные целые числа в диапазоне от 1 до n . \
 *  Найдите недостающий элемент.
 *
 * input:
 * arr[] = {1,2,3,5}
 * out: 4
 *
 *
 * arr[] = {6,1,2,8,3,4,7,10,5}
 * out: 9
 */
public class Task1 {

    public static void main(String[] args) {
        int [] array = {1, 2, 5, 4};
        System.out.println(arrayCheck(array));

    }
    public static int arrayCheck(int [] array){
        //{ 1 , 4, 3 , 5}
       int sum = 0 ;
       int realSum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        for (int i = 1; i <=array.length+1 ;i++){
            realSum+= i;
        }
        return realSum - sum;
    }
}
