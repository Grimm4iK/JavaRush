Написать программу, выводящую на экран надпись "Элли самая красивая" 5 раз. Каждый раз - с новой строки.

Пример вывода на экран:
Элли самая красивая
Элли самая красивая
Элли самая красивая
Элли самая красивая
Элли самая красивая

Требования:
•	Программа должна выводить текст.
•	Текст должен начинаться с "Элли".
•	Текст должен заканчиваться на "красивая".
•	Текст должен состоять из 5 строк.
•	Выводимый текст должен соответствовать заданию.


package com.javarush.task.task01.task0102;

/* 
Комплимент учителю
*/

public class Solution {
    public static void main(String[] args) {
        String message = "Элли самая красивая";

		System.out.println(message);
		System.out.println(message);
		System.out.println(message);
		System.out.println(message);
		System.out.print(message);
    }
}
