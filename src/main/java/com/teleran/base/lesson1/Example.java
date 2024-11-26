package com.teleran.base.lesson1;

import java.util.Random;
import java.util.Scanner;

public class Example {
    // точка входа в програму ето main метод
    // он есть в любом java приложении , с него начинаеться наша програма
    // етот метож первим визивает java машина

    // в Джава програма состои из файлов , которие ми називаем класами
    // в текущей програме ми имеем файл Example.java

    // public - слово означает что метод можно достать с любой точки нашего проекта
    // static - для визова етого метода не нужно допольнительно создавать екземпляр класа
    // void - говорит о том что метод ничего не возвращает
    // main - имя метода
    // String[] args - набор параметров , которие можно передать в нашу програму при запуске

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please write your name");
        String name1 = console.nextLine();
        System.out.println("Please write a name your wife");
        String name2 = console.nextLine();
        System.out.println("hi , user " + name1 +" and " + name2);
    }
}
