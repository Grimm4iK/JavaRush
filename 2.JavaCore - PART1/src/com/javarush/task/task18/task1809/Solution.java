package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(fileName1);
        FileOutputStream outputStream = new FileOutputStream(fileName2);

        ArrayList<Integer> list = new ArrayList<>();

        while (fileInputStream.available() > 0 ){
            int tmp = fileInputStream.read(); //в переменную tmp записали первый символ
            list.add(0, tmp);
        }
            for(int i = 0; i < list.size(); i++){
                outputStream.write(list.get(i));
            }
            fileInputStream.close();
            outputStream.close();
    }
}
