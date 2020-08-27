package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        BufferedReader fr = new BufferedReader(new FileReader(file1));
        BufferedWriter fw = new BufferedWriter(new FileWriter(file2));

        while (fr.ready()) {
            String s;
           while ((s = fr.readLine()) != null) {
                fw.write(s.replace('.', '!') + "\n");
           }
        }

        fr.close();
        fw.close();

    }
}
