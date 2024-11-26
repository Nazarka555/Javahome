package com.teleran.base.lesson3;

public class StringExampleTwo {
    public static void main(String[] args) {
        String text = "Hello";
        System.out.println(text);
        //вызов метода вычисления длину строки и присвоение результата
        //в переменную text.length
        int textlengs = text.length();
        System.out.println("Text lengs = " + textlengs);

        //метод получения символов из строки по номеру(индекс)
        //номер называеться индекс
        //сымвол в строке нумеруеться с 0
        //первый символ хранится по номером 0 , последние по номером n - 1
        //где n длина строки
        // charAt(index)
        char symbol = text.charAt(0);
        System.out.println("Symbol by 0 index = " + symbol);

        char symbolEnd = text.charAt(4);
        System.out.println("Symbol by 5 index = " + symbolEnd);
        System.out.println(text.charAt(4));


    }
}