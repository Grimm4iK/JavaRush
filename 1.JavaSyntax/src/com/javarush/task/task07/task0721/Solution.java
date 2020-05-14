package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] array = new int[20];
        for(int i=0; i < 20; i++){
            array[i] = Integer.parseInt(reader.readLine());
        }
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        for (int n=0; n < array.length;n++)
        {
            if (minimum > array[n]){
                minimum = array[n];}
            if (maximum < array[n]){
                maximum = array[n];}
        }

        //напишите тут ваш код

        System.out.print(maximum + " " + minimum);
        System.out.print(minimum);
    }
}
