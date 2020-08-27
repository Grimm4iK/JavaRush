package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        BufferedReader fr = new BufferedReader(new FileReader(file1));
        BufferedWriter fw = new BufferedWriter(new FileWriter(file2));

        while (fr.ready()) {
            String[] lines = fr.readLine().split(" ");

            for (String s: lines) {
                try {
                    int z = Integer.parseInt(s);
                    String x = z + " ";
                    fw.write(x);
                } catch (Exception e) { }
            }
        }

        fr.close();
        fw.close();
    }
}
