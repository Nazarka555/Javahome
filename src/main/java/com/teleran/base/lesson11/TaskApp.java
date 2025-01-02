package com.teleran.base.lesson11;

/**
 * нужно создать клас Dog
 * кличка
 * возраст
 * порода
 * рост
 * создать 3 различних собаки и вивести информацию о всех собаках в коносль
 */
public class TaskApp {

    public static void main(String[] args) {
        Dog dogOne = new Dog("Sharik",10,"Sharka",120);
        Dog dogTwo = new Dog("Bobik ",5 ,"Bob", 110);
        Dog dogThree = new Dog("Pupsik" , 11,"Pups",112);

        dogOne.print();
        dogTwo.print();
        dogThree.print();

        Dog [] arrayDog ={dogOne , dogTwo , dogThree};
        for (Dog dog : arrayDog) {
            dog.print();
        }

    }
}
