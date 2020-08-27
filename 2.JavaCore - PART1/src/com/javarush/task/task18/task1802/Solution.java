package com.javarush.task.task18.task1802;

/* 
Минимальный байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine(); //Записали имя файла
        reader.close(); // закрыли поток
        FileInputStream input = new FileInputStream(fileName); // Создает объект потока и кладем имя файла
        int min = input.read(); // Считываем байт из файла и записываем в переменную max
        while (input.available() > 0) //пока есть еще непрочитанные байты
        {
            int data = input.read(); // прочитать очередной байт в переменную data
            if (data < min) // если прочитанный байт больше того что находится в переменной max, то...
                min = data; // присваем его в переменную макс и делаем так пока не переберем все байты
        }
        input.close();
        System.out.println(min);
    }
}
