package com.javarush.task.task18.task1803;

/* 
Самые частые байты
*/
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String path = bufferedReader.readLine(); //считываем имя файла из консоли
        FileInputStream fileInputStream = new FileInputStream("C:/Users/adria/Desktop/test.txt"); //Считываем из файла

        Map<Integer, Integer> listOfChars = new HashMap<>();

        // список для вывода уникальных значени самых частовстречающихся
        List<Integer> listForOutput = new ArrayList<>(); //Список повторяющихся значений

        // под хранение считанного символа
        Integer tmpInt;
        // Максимальная частота
        Integer maxFreq = 0;
        //пока остались непрочитанные байты
            while (fileInputStream.available() > 0) { //Считываем из файла пока не закончились байты
                // считали один символ из потока
                tmpInt = fileInputStream.read(); //в tmpInt хранится один символ

                // если считанный символ уже содержится в HashMap - увеличиваем счетчик на 1
                if (listOfChars.containsKey(tmpInt)) {
                    // считываем старое значение и инкрементируем на 1
                    Integer tmp = listOfChars.get(tmpInt) + 1;

                    // заносим обновленное значение количества повторов в HashMap в соответствии
                    // с ключем - собственно, уникальным считанным из файла символом
                    listOfChars.put(tmpInt, tmp); // tmpInt - байт
                                                  // tmp - число повторений этого байта

                    // находим минимальное значение частоты повторов в тексте
                    if (tmp > maxFreq) { //если частота повторов больше 0, то
                        maxFreq = tmp; // то записываем частоту повторов в maxFreq
                    }
                }
                // если считанный символ новый и уникальный - вносим его в HashMap
                // и проставляем первоначальное количество 1
                else {
                    listOfChars.put(tmpInt, 1);
                }
            }
            fileInputStream.close();
            // заночсим в отдельный список самые часто повторяющиеся символы
            for (Map.Entry<Integer, Integer> pair : listOfChars.entrySet()) { //Берем список который уже есть в хешмапе
                if (pair.getValue().equals(maxFreq)) { //если данный символ равен числу повторений
                    //if (!listForOutput.contains(pair.getValue())) { //
                        listForOutput.add(pair.getKey());
                    //}
                }
            }

            // вывод первого элемента
        /*if(listForOutput.size() > 0 ) {
            System.out.print("Первый элемент первый: " + listForOutput.get(0));
        }
        else {
            System.out.println("файл пустой");
        }*/
            // вывод оставшихся элементов
            //if (listForOutput.size() > 1) {
                for (int i = 0; i < listForOutput.size(); i++) {
                    System.out.print(" " + listForOutput.get(i));
                }
            }
        }
//}




