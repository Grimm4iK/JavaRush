package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileOne = reader.readLine();

        reader.close();

        BufferedReader reader1 = new BufferedReader(new FileReader(fileOne));
        int count = 0;
        while (reader1.ready()) {
            for (String s : reader1.readLine().split("\\W")) {
                if (s.equals("world")) {
                    count++;
                }
            }
        }
        reader1.close();
        System.out.println(count);
    }
}
