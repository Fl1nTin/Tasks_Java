package tasks;

import java.util.*;

/*Необходимо преобразовать строку в новую строку, где каждый символ в новой строке равен "(",
если этот символ появляется только один раз в исходной строке, или ")",
если этот символ появляется более одного раза в исходной строке.
Игнорируйте заглавные буквы при определении того, является ли символ дубликатом.*/
/*"din"      =>  "((("
"recede"   =>  "()()()"
"Success"  =>  ")())())"*/

public class Duplicate_Encoder {
    static String encode(String word) {
        Map<Character, Integer> map = new HashMap<>();
        for (char i : word.toLowerCase().toCharArray()) {
            int s = map.getOrDefault(i, 0) + 1;
            map.put(i, s);
        }

        StringBuilder builder = new StringBuilder();
        for (char i : word.toLowerCase().toCharArray())
            builder.append(map.get(i) > 1 ? ')' : '(');

        return builder.toString();
    }
}
