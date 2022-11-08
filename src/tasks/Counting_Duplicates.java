package tasks;

import java.util.*;

/*Напишите функцию, которая будет возвращать количество различных буквенных символов и цифр,
не зависящих от регистра, которые встречаются во входной строке более одного раза.
Можно предположить, что входная строка содержит только буквы (как прописные, так и строчные) и цифры.*/
/*"abcde" -> 0 # ни один символ не повторяется более одного раза
"aabbcde" -> 2 # 'a' и 'b'
"aabBcde" -> 2 # 'a' встречается дважды и 'b' дважды (`b` и `B`)
"indivisibility" -> 1 # 'i' встречается шесть раз
"Indivisibilities" -> 2 # 'i' встречается семь раз, а 's' дважды
"aA11" -> 2 # 'a' и '1'
"ABBA" -> 2 # 'A' и 'B' встречаются дважды*/

public class Counting_Duplicates {
    public static int duplicateCount(String text) {
        Map<Character, Integer> map = new HashMap<>();
        for (char i : text.toLowerCase().toCharArray()){
            if (!map.containsKey(i))
                map.put(i, 1);
            else {
                map.replace(i, map.get(i) + 1);
            }
        }
        int count = 0;
        for (int i : map.values()){
            if (i > 1)
                ++count;
        }

        return count;
    }
}
