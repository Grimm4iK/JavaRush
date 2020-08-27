package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("file");
        words.add("file2");
        words.add("file3");
        words.add("file4");
        words.add("file1");
        words.add("file6");
        words.add("file8");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        reader = new BufferedReader(new FileReader(fileName));
        int count = 0;
        String s;
        while ((fileName = reader.readLine()) != null) {
            s = fileName;
            String[] list = s.split(" ");
            for (String x : list) {
                for (String y : words) {
                    if (x.equals(y)) {
                        count++;
                    }
                }
            }
            if (count == 2) {
                System.out.println(s);
            }
            count=0;
        }
        reader.close();
    }
}
