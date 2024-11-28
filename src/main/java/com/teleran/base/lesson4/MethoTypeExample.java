package com.teleran.base.lesson4;

/**
 * методы должни начинаться глаголами и отображать что они делают
 * Сигнатура метода это имя + параметры
 * Внутри одого класса методы должны иметь уникальную структуру
 *
 * printInfo, start , run, jump, (методы которые ничего не возвращают)
 *
 * getSum , getAge, generateCar ,createStudent , getRandom (обычно это методы которые возвращают что-то)
 *
 * Желательно что бы метод делал что то одно
 *
 *
 */
public class MethoTypeExample {

    //1 - ничего не принимает , ничего не возвращает
    public static void print(){

    }

    //2 - что то принимает , ничего не возвращает
    public static void printText(String text, int number){

    }
    //3 - ничего не принимает , что то возвращает
    public static int getAge(){
        // return - оператор который возвращает значения из метода
        return 35;
    }

    //4 - что то принимает , что то возвращает
    public static int getSum(int a, int b){
        int sum = a + b;
        return sum;
    }
}
