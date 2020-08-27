package com.javarush.task.task18.task1808;
/* 
Разделение файла
*/
import java.io.*;
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //поток на чтение
        FileInputStream inputStream = new FileInputStream(reader.readLine());

        //Переменная для записи
        int a = inputStream.available();

        //1 файл
        //поток на запись
        FileOutputStream outputStream = new FileOutputStream(reader.readLine());
        //Создаем массив на какое то колл-во ячеек
        byte[] buffer = new byte[(a + 1) / 2];

        //прочитать очередной блок байт в переменную buffer и реальное количество в count
        int count = inputStream.read(buffer);

        outputStream.write(buffer, 0, count);//записать блок(часть блока) во второй поток
        outputStream.close();// зарывает поток

        //2 файл
        //поток на запись
        outputStream = new FileOutputStream(reader.readLine());
        buffer = new byte[a / 2];

        count = inputStream.read(buffer);

        outputStream.write(buffer, 0, count);//записать блок(часть блока) во второй поток
        outputStream.close();//закрывает поток
        inputStream.close();//закрывает поток
    }
}