package com.teleran.base.lesson12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Это тестовый класс , для класса AppExample
 */
class ApppExampleTest {
    @Test // данный метод является тестом
    public void testGetSum() {
    int a  = 2;
    int b  = 3;
        int sum = ApppExample.getSum(a, b);
        // предполагаем что 5 == sum
        assertEquals(5,sum);
    }
    @Test
    public void testGetFullPrice(){
        int priceTrio = 5;
        int number = 2;
        int fullPrice = ApppExample.getFullPrice(priceTrio , number);
        assertEquals(10,fullPrice);
    }
}