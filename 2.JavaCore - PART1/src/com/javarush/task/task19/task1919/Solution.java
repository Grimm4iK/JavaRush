package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeMap<String, Double> map = new TreeMap<>();
        FileReader fileReader = new FileReader("C:/Users/adria/Desktop/text.txt");

        BufferedReader rd = new BufferedReader(fileReader);

        String[] symbols;
        String line;
        Double currentValue;

        while ((line = rd.readLine()) != null) {
            symbols = line.split(" ");

            if (map.containsKey(symbols[0])){
                currentValue = map.get(symbols[0]);
                map.put(symbols[0], Double.parseDouble(symbols[1]) + currentValue);
            }else {
                map.put(symbols[0], Double.parseDouble(symbols[1]));
            }
        }
        rd.close();
        fileReader.close();

        for(String key: map.keySet()){
            System.out.println(key + " " + map.get(key));
        }

    }
}