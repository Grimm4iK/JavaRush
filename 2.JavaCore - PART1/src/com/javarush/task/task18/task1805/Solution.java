package com.javarush.task.task18.task1805;

/* 
Сортировка байт
*/


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;


public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine(); // Читаем название файла
        FileInputStream stream = new FileInputStream(path); // Читаем из файла
        TreeSet<Integer> treeSet = new TreeSet<>();

        while (stream.available() > 0) //Считываем из файла пока не закончились байты
        {
            treeSet.add(stream.read());
        }
        stream.close();
        for (Integer i : treeSet)
        {
            System.out.print(i + " ");
        }
    }
}
