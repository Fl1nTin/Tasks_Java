package tasks;

import java.util.*;

//Напишите функцию, которая проверяет, являются ли все элементы в массиве анаграммами (перестановка букв) друг друга.

public class Anagrams {
    public static boolean allAnagrams(String[] str) {
        char[] ch = str[0].toLowerCase().toCharArray();
        Arrays.sort(ch);
        for (int i = 1; i < str.length; i++) {
            char[] ch2 = str[i].toLowerCase().toCharArray();
            Arrays.sort(ch2);
            if (!Arrays.equals(ch, ch2))
                return false;
        }
        return true;
    }
}
