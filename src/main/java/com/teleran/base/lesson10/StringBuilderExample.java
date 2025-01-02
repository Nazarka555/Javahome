package com.teleran.base.lesson10;

/**
 * StringBuilder -нужен ждя того что бы работать с изменениями в строке
 * добавлять к строке ,удалять из строки, заменить что то в строке
 * без создания каждый раз новой строки после каждого действия
 *
 * внутри стоки лежит массив байт
 * внутри стринг билдинг тоже масив , когда мы добавляем что то к строке
 * мы добавляем это в масив
 */
public class StringBuilderExample {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("helloy");
        sb.append(" Java");
        sb.append(" ").append(" class").append(" Ok!");
        sb.delete(3,6);
        sb.reverse();
        String result = sb.toString();
        System.out.println(result);

        String [] array = {"helloy" , "problem one", "result one", "error", "result"};
        System.out.println(getAnswer(array));
    }
    public static String getAnswer(String [] strings){
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < strings.length ; i++) {
            answer = answer.append(strings[i]).append(" ");
        }

        return answer.toString();
    }
}
