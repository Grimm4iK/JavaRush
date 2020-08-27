package com.javarush.task.task19.task1904;

/* 
И еще один адаптер
*/



import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{
        private final Scanner fileScanner;


        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException, ParseException {
           String res = fileScanner.nextLine();
           Scanner scanner = new Scanner(res).useDelimiter(" ");
            String lastName = scanner.next();
            String name = scanner.next();
            String thirdName = scanner.next();
            String birthday = scanner.next() + " " + scanner.next() + " " + scanner.next();

            Date date = new SimpleDateFormat("dd MM yyyy").parse(birthday);

            return new Person(name, thirdName, lastName, date);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();

        }
    }
}
