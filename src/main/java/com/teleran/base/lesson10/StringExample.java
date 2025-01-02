package com.teleran.base.lesson10;

/**
 * строка ссылочный тип данных . это объект в оперативной памяти
 * строка это неизменяемий объект . изменить созданую строку нельзя
 * при попытке что то добавить к существующей строке - будет создана новая строка
 *
 */
public class StringExample {

    public static void main(String[] args) {
        String text = "helloy java";

        String [] array = {"helloy" , "problem one", "result one", "error", "result"};

        String asnwer = getAnswer(array);
        System.out.println(asnwer);
    }
    public static String getAnswer(String [] strings){
        String anwer = "";
        for (int i = 0; i < strings.length ; i++) {
            anwer = anwer + " " + strings[i];
        }

        return anwer;
    }
}
