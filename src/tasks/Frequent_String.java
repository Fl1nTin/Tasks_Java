package tasks;

import java.util.HashMap;
import java.util.Map;

/*Напишите функцию, которая принимает массив строк и возвращает самую часто встречающуюся строку в этом массиве.
Если таких строк несколько, то нужно вернуть первую.*/

public class Frequent_String {
    public static String highestFrequency(String[] str) {
        if (str == null)
            return "";

        String ss = "";
        int max = 0;
        Map<String, Integer> map = new HashMap<>();
        for (String st : str) {
            if (!map.containsKey(st))
                map.put(st, 1);
            else
                map.put(st, map.get(st) + 1);

            if (map.get(st) > max) {
                ss = st;
                max = map.get(st);
            }
        }
        return ss;
    }
}
