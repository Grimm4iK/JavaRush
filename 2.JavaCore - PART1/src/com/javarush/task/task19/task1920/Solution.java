package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:/Users/adria/Desktop/text.txt"));
        TreeMap<String, Double> map = new TreeMap<>();
        TreeSet<Double> tset = new TreeSet<>();

        while (reader.ready()){
            String[] array = reader.readLine().split(" ");
            if(map.containsKey(array[0])){
                map.put(array[0], map.get(array[0]) + Double.parseDouble(array[1]));

            }else
                map.put(array[0], Double.parseDouble(array[1]));
        }
        reader.close();

        tset.addAll(map.values());
        double d = tset.pollLast();

        for(Map.Entry<String, Double> pair: map.entrySet()){
            if (pair.getValue().equals(d)){
                System.out.println(pair.getKey());
            }
        }
    }
}
