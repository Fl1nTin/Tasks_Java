package tasks;

import java.util.ArrayList;

/*Данные два массива строк a1 и a2 возвращают отсортированный массив r в лексикографическом порядке строк a1,
которые являются подстроками строк a2.
Например:
a1 = ["arp", "live", "strong"]
a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
returns ["arp", "live", "strong"]*/

public class Which_Are_In {
    public static String[] inArray(String[] array1, String[] array2) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : array1) {
            for (String s1 : array2) {
                if (s1.contains(s) && !list.contains(s))
                    list.add(s);
            }
        }

        return list.stream().sorted().toArray(String[]::new);
    }
}
