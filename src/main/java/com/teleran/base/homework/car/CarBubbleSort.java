package com.teleran.base.homework.car;

public class CarBubbleSort {

    public static void main(String[] args) {
        CarSort car1 = new CarSort("BMW", 2.0);
        CarSort car2 = new CarSort("Audi", 3.7);
        CarSort car3 = new CarSort("VW", 1.0);
        CarSort car4 = new CarSort("Skoda", 2.1);
        CarSort car5 = new CarSort("Seat", 1.4);

        CarSort[] carsSort = {car1, car2, car3, car4, car5};

        sortCarsOfPrice(carsSort);
        printCars(carsSort);
    }

    public static void printCars(CarSort[] carsSort) {
        for (int i = 0; i < carsSort.length; i++) {
            System.out.println("Model " + carsSort[i].model + " price " + carsSort[i].price);
        }
    }

    public static void sortCarsOfPrice(CarSort [] carsSort){
        for (int j = 0; j < carsSort.length; j++) {
            for (int i = 0; i < carsSort.length - 1 - j; i++) {
                if (carsSort[i].price > carsSort[i + 1].price) {
                    double temp = carsSort[i + 1].price;
                    carsSort[i + 1].price = carsSort[i].price;
                    carsSort[i].price = temp;
                }
            }
        }
    }

    public static void sortCarsOfName(CarSort [] carSorts){

    }
}
