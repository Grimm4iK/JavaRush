package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();
        reader.close();
        //Создаем поток-записи-байт-в-файл 1
        FileOutputStream fileOutputStream = new FileOutputStream(fileName1);
        //Создаем поток-чтения-байт-из-файла 2
        FileInputStream fileInputStream = new FileInputStream(fileName2);
        //Создаем поток-чтения-байт-из-файла 3
        FileInputStream fileInputStream1 = new FileInputStream(fileName3);

        byte[] buffer = new byte[fileInputStream.available()];
        fileInputStream.read(buffer);
        

        byte[] buffer1 = new byte[fileInputStream1.available()];
        fileInputStream1.read(buffer1);

        fileOutputStream.write(buffer);
        fileOutputStream.write(buffer1);

        fileOutputStream.close();
        fileInputStream.close();
        fileInputStream1.close();



    }
}
