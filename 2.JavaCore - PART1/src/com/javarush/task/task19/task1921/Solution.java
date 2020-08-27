package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:/Users/adria/Desktop/text.txt"));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d M yyyy");

        while (bufferedReader.ready()){
            String str = bufferedReader.readLine();
            PEOPLE.add(new Person(str.replaceAll("\\d+", "").trim(), simpleDateFormat.parse(str.replaceAll("\\D+\\s", ""))));
        }
        bufferedReader.close();


    }
}
