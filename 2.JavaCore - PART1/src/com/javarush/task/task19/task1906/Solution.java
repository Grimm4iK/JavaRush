package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
            public static void main(String[] args) throws IOException {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String fileOne = reader.readLine();
                String fileTwo = reader.readLine();
                reader.close();

                FileReader fileReader = new FileReader(fileOne);
                FileWriter fileWriter = new FileWriter(fileTwo);

                int cnt = 1;
                while (fileReader.ready()){
                    int data = fileReader.read();
                    if(cnt % 2 == 0){
                        fileWriter.write(data);
                    }
                    cnt++;
                }
                fileReader.close();
                fileWriter.close();
            }
        }


