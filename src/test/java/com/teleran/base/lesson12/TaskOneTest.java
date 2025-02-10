package com.teleran.base.lesson12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskOneTest {
    @Test
    public void testGetMaxWhenArrayIsCorrect(){
        int [] ints = {2,4,6,1};
        TaskOne taskOne = new TaskOne();
        int max = taskOne.getMax(ints);
        assertEquals(6,max);
    }
    @Test
    public void testGetMaxWhenArrayIsNull(){
        TaskOne taskOne = new TaskOne();
        int [] ints = null;
        assertEquals(-1,taskOne.getMax(ints));
    }
    @Test
    public void testGetMaxWhenArrayIsEmpty(){
        TaskOne taskOne = new TaskOne();
        int [] ints = {};
        assertEquals(-1,taskOne.getMax(ints));
    }

}