package com.teleran.base.lesson10;

public class practic3 {
    public static void main(String[] args) {
        String text = "helloy Java";
        System.out.println(changeWords(text));
    }
    public static String changeWords(String text){
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        int index = 0;
        for (int i = 0; i < text.length() ; i++) {
            char temp = text.charAt(i);
            if (temp != ' '){
                sb.append(temp);
            }else {
                index = i+1;
                break;
            }
        }
        for (int i = index; i < text.length() ; i++) {

            char temp = text.charAt(i);
            if (temp != ' '){
                sb1.append(temp);
            }
        }
        sb1.append(" ").append(sb);
        return sb1.toString();
    }
}
