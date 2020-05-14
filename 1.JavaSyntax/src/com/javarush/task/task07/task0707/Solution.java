package com.javarush.task.task07.task0707;
import java.util.ArrayList;
/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
         list.add("q1");
        list.add("q2");
        list.add("q3");
        list.add("q4");
        list.add("q5");
        System.out.println(list.size());
        for (int i=0; i < list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }
}
