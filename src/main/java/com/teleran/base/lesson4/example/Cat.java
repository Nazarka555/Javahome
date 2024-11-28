package com.teleran.base.lesson4.example;

/**акже
 * есть еще один метод , который называеться конструктором
 * он называеться так же как и имя кеииласа , включая регистр
 * и без типа возвращаемих параметров
 * Клас - это чертеж для создания объекта
 * Объект - это экземпляр определьонного класа
 *
 * Клас - чертеж автомобиля , Объект - физический автомобиль,
 * созданный по этому чертежу
 */
public class Cat {
    //переменная екземпляра
    String name;
    int age;
    boolean bb ;
    String str;

    //Конструктор , но это тоже метод
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Cat(boolean bb , String str){
        this.bb = bb;
        this.str = str;
    }


}
