package com.teleran.base.lesson10;

/**
 * * Task two :
 *  * char[] arr = {'I','L','i','k','?', ' ','J','a','v','a'};
 *  * Написать метод, который сделает из него строку и перед этим
 *  * в этом методе заменить ? на e
 *  *
 *  */

public class Practice2 {

    public static void main(String[] args) {
        char[] arr = {'I', 'L', 'i', 'k', '?', ' ', 'J', 'a', 'v', 'a'};
        System.out.println(changer(arr));
    }

    public static String changer(char[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '?') {
                sb.append('e');
            } else {
                sb.append(arr[i]);
            }
        }

        return sb.toString();
    }
}
