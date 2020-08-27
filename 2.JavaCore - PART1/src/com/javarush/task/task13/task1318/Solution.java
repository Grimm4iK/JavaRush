package com.javarush.task.task13.task1318;

/* 
Чтение файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream in = new FileInputStream(fileName);

        while(in.available()>0) {
            System.out.write(in.read());
        }
        System.out.println();

        in.close();
        reader.close();
    }
}