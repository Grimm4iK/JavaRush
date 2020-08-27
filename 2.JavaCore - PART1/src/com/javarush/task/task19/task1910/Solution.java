package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String fileIn = reader.readLine();
        String fileOut = reader.readLine();
        reader.close();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileIn));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileOut));
        String s;
        while ((s = fileReader.readLine()) != null) {
            fileWriter.write(s.replaceAll("\\p{Punct}", ""));
        }
        fileWriter.close();
        fileReader.close();
    }
}
