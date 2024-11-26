package com.teleran.base.lesson3;

/**
 * локальные переменные - перемееная метода, конструктора , блока
 * создаються внутри метода и уничтожаються когда методы заканчивают работу
 * <p>
 * переменный екземпляр - переменные обявляються вне каких либо
 * блоков , методов, конструкторов
 * создаються когда создаються объекты (екземпляры) на основании класа
 * и уничтожаються когда уничтожаються объекты
 * <p>
 * статичные переменные - переменная класа
 * создаються при начале роботы програмы и уничтожаються при
 * завешении работы програмы
 */
public class VariablesExample {

    //переменная екземпляра (переменная объявленная в класе)
    int count = 50;

    //Статическая переменная (переменная класа)
    static int age = 25;

    public static void main(String[] args) {
        // локальная переменная
        // переменная внутри метода
        // переменная живет внутри {}
        int number = 10;// переменная метода main
        number = 20;
        System.out.println(number);

        System.out.println(age);

        /**
         VariablesExample variablesExample = new VariablesExample();
         System.out.println(variablesExample.count);
         **/
    }

    private static void print() {
        // локальная переменная
        int number = 5; // переменная метода print
        System.out.println(age);
    }

    private void voidCount() {
        System.out.println(count);
        System.out.println(age);
    }
}
