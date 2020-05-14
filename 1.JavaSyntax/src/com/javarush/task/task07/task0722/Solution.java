package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //1. Объяви переменную типа список строк и сразу проинициализируй ee.
        ArrayList<String> list = new ArrayList<String>();
        //2. Считывай строки с клавиатуры и добавляй их в список, пока пользователь не введет строку "end".
        String s;
        while (true){
            s = reader.readLine();
            if(s.equals("end"))
                break;
            list.add(s);
        }
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        //напишите тут ваш код
    }
}