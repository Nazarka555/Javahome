package com.teleran.base.lesson10;

/**
 * стeковая память (stack)
 * в стеке храняться значения примитивных переменных
 * когда запускаеться кокой либо метод для него создаеться блок стеековой памяти
 * в которой создаються примитивные значения
 * Когда метод заканчывает свою работу . то блок стековой памяти удаляеться
 * и удаляет за мобой примитивные переменные
 *
 * куча(heap)
 */
public class MemoryExample {

    public static void main(String[] args) {
        int number = 10;
        print();
    }
    public static void print(){
        int count = 20;
    }
}
