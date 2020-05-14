package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());

        for(int i=0; i < N; i++){
            list.add(reader.readLine());
        }
        String tmp;
        for(int k=0; k < M; k++ ){
            tmp = list.get(0);
            list.remove(0);
            list.add(tmp);
        }
        for(int n=0; n < list.size(); n++){
            System.out.println(list.get(n));
        }

        //напишите тут ваш код
    }
}
