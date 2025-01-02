package com.teleran.base.lesson11;

/**
 * в Java есть класс под названием Object , это суперкласс
 * это родитель всех класов в Java
 *
 */
public class Person {

    private String name;

    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return " OUR Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
