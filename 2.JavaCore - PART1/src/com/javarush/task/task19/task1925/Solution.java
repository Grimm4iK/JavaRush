package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(args[1]));

        boolean firstWord = true;

        while (bufferedReader.ready()) {
            String line = bufferedReader.readLine();
            String[] words = line.split(" ");

            for (String word : words) {
                if (word.length() > 6) {

                    if (firstWord)
                        firstWord = false;
                    else
                        bufferedWriter.write(",");

                    bufferedWriter.write(word);
                }
            }
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}