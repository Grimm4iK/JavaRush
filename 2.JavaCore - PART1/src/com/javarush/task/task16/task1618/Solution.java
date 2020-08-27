package com.javarush.task.task16.task1618;

/* 
Снова interrupt
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        //Add your code here - добавь код тут
        TestThread test = new TestThread();
        System.out.println("Main: start thread");
        test.start();
        System.out.println("Main: waiting 3 seconds");
        Thread.sleep(3000);
        System.out.println("Main: stop thread");
        test.interrupt();


    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread{
        @Override
        public void run() {
            while (true){
                try {
                    Thread.sleep(1000);
                    System.out.println("Thread: massage");
                } catch (InterruptedException e){
                    System.out.println("Thread: terminated");
                    return;
                }
            }
        }
    }
}