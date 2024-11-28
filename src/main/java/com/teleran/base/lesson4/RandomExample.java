package com.teleran.base.lesson4;

import java.util.Random;

/**
 * когда в переменную записали примитивное значение ,
 * используем фразу - обращаемся к этой переменной
 *
 * Когда в переменную записали ссылочные значения (созданое через new)
 * тогда перменная хрант не значения , а ссылку на объект
 * используем фразу - обращаемся е этомв объекту , вызываем у етого объекта
 */

public class RandomExample {

    public static void main(String[] args) {
        Random random = new Random();

        int numberOne = random.nextInt();
        System.out.println(numberOne);

        int numberTwo = random.nextInt(5, 17);
        System.out.println(numberTwo);

        int numb
    }
}
