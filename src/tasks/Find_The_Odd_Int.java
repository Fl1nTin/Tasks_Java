package tasks;

import java.util.*;

/*Учитывая массив целых чисел, найдите то, которое встречается нечетное число раз.
Всегда будет только одно целое число, которое появляется нечетное число раз.*/

public class Find_The_Odd_Int {
    public static int findIt(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : a) {
            int count = map.getOrDefault(i, 0) + 1;
            map.put(i, count);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 == 1)
                return entry.getKey();
        }

        return 0;
    }
}
