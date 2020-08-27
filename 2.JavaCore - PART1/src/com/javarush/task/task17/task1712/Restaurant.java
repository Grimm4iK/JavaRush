package com.javarush.task.task17.task1712;

import java.util.ArrayList;
import java.util.List;

/* 
Ресторан
*/

public class Restaurant {
    public static List<Thread> threads = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        Waiter waiterTarget = new Waiter(); //создание объекта waiterTarget
        Thread waiter = new Thread(waiterTarget); //добавление waiterTarget в 1 поток
        threads.add(waiter); //добавление waiter в List (threads)

        Cook cookTarget = new Cook();
        Thread cook = new Thread(cookTarget); //добавление cookTarget во 2 поток
        threads.add(cook); //добавление cook в List (threads)

        waiter.start(); //Старт 1 потока и переход в метод Run
        cook.start();//Старт 2 потока и переход в метод Run

        Thread.sleep(2000);
        cookTarget.continueWorking = false;
        Thread.sleep(500);
        waiterTarget.continueWorking = false;
    }
}
