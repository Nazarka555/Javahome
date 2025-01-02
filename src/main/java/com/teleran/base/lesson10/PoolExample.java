package com.teleran.base.lesson10;

/**
 * Stack :
 * | |
 * | |
 * | |
 * |main : S |
 *
 * Heap:
 *  *----------String pool--------
 *      #FFEE00 : "Cat"
 *  *-----------------------------
 */
public class PoolExample {

    public static void main(String[] args) {
        String cat = "cat";
        String ca1 = "cat";
        String cat2 = "cat";

        System.out.println(ca1 == cat2);

        String four = new String("cat");
        System.out.println(four);

        System.out.println("one == four " + cat == four);
        System.out.println("one == four " + cat.equals(four));

    }
}
