package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String f1 = reader.readLine(); //Записали имя первого файла
        String f2 = reader.readLine(); //Записали имя второго файла
        reader.close();//Закрыли поток

        FileInputStream fis1 = new FileInputStream(f1); //Считываем байты из первого файла
        FileInputStream fis2 = new FileInputStream(f2); //Считываем байты из второго файла

        ArrayList<Integer> list = new ArrayList<>(); //Создаем динамический массив

        while (fis2.available() > 0){ //Считываем пока еще есть символы(байты)
            list.add(fis2.read());//Добавляем их в массив
        }

        while (fis1.available() > 0){ //Считываем пока еще есть символы(байты)
            list.add(fis1.read()); //Добавляем их в массив
        }

        //Создаем поток записи символов в первый файл
        FileOutputStream fos = new FileOutputStream(f1);
        //Записываем в первый файл содержимое второго файла
        for (int x : list){
            fos.write(x);
        }
        fis1.close();
        fis2.close();
        fos.close();

    }
}
