package com.teleran.base.lesson6;

import java.util.Scanner;

public class TaskGame {
    public static void main(String[] args) {
        System.out.println("Menu :");
        System.out.println(" 1 - Start, 2 - Winners , 3 - exit");
        Scanner console = new Scanner(System.in);
        int input = console.nextInt();
        console.close();

        switch (input){
            case 1->startGame();
            case 2->printWinner();
            case 3->exit();
        }
    }
    public static void startGame(){
        System.out.println("start");
    }
    public static void exit(){
        System.out.println("winner");
    }
    public static void printWinner(){
        System.out.println("exit");
    }
}
