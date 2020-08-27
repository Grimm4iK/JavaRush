package com.javarush.task.task15.task1530;

/* 
Template pattern
*/

public class Solution {
    public static void main(String[] args) {

        TeaMaker CupOfTea = new TeaMaker();
        CupOfTea.makeDrink();

        LatteMaker CupOfLatte = new LatteMaker();
        CupOfLatte.makeDrink();
    }
}
