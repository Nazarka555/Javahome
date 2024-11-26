package com.teleran.base.lesson3;

public class StringExample {
    public static void main(String[] args) {
        String text = "Helloy Java";
        System.out.println(text);

        //String - это ссылочный тип данных (строки это объекты)
        //внутри любой строки хранится набор симаолов
        //String text = "Helloy" ; "H" , "e", "l", "l", "o", "y"
        //строка это массыв символов!!!

        // стооки в джава неизменяемы
        // при любой попытке изменить строку
        // в джава создаеться новая строка
        int count  = 10;// место в памяти выделяеться только один раз
        count = 20;// новіе значения записываеться в то же самое место

        String one = "Helloy";// выделяеться место в памяти под слово "helloy"
        one = "Hi"; // будет выделено новое место в памяти под слово "hi"
    }
}
