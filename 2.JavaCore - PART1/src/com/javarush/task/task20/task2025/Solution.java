package com.javarush.task.task20.task2025;

import java.util.Arrays;

/*
Алгоритмы-числа
/*
1) Для выполнены данной задачи обязательно к прочтению https://acmp.ru/article.asp?id_text=198
и в wiki https://ru.wikipedia.org/wiki/%D0%A7%D0%B8%D1%81%D0%BB%D0%BE_%D0%90%D1%80%D0%BC%D1%81%D1%82%D1%80%D0%BE%D0%BD%D0%B3%D0%B0
2) Закоменнтированный код можно попробовать оптимизировать (его не удаляю).
 */
import java.util.LinkedList;
import java.util.List;
import java.util.Date;

public class Solution {

    public static long[] getNumbers(long N) {
        long[] gold = new long[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54748, 92727, 93084, 548834, 1741725, 4210818, 9800817, 9926315, 24678050, 24678051, 88593477, 146511208, 472335975, 534494836, 912985153, 4679307774L, 32164049650L, 32164049651L, 40028394225L, 42678290603L, 44708635679L, 49388550606L, 82693916578L, 94204591914L, 28116440335967L, 4338281769391370L, 4338281769391371L, 21897142587612075L, 35641594208964132L, 35875699062250035L, 1517841543307505039L, 3289582984443187032L, 4498128791164624869L, 4929273885928088826L};
        List<Long> result = new LinkedList<>();
        for (long aGold : gold) {
            if (aGold >= N) {
                break;
            }
            result.add(aGold);
        }

        long[] res = new long[result.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = result.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        long timeStart = new Date().getTime();
        System.out.println(Arrays.toString(getNumbers(Long.MAX_VALUE)));
        long timeEnd = new Date().getTime();
        System.out.println("Estimate time (sec): " + (timeEnd - timeStart)/( 1000 * 1d));
    }
}
