package tasks;

/*Учитывая последовательность слов, вам нужно найти слово, набравшее наибольшее количество баллов.
Каждая буква слова набирает очки в соответствии с ее положением в алфавите: a = 1, b = 2, c = 3 и т.д.
Вам нужно вернуть слово с наивысшим баллом в виде строки.
Если два слова набирают одинаковый балл, верните слово, которое появляется раньше всего в исходной строке.
Все буквы будут строчными, и все входные данные будут действительными.*/

public class Highest_Scoring_Word {
    public static String high(String s) {
        String retWord = "";
        int score = 0;

        for (String i : s.split(" ")) {
            int sumChars = 0;
            for (char ch : i.toCharArray()) {
                sumChars += ch - 96;
            }
            if (sumChars > score) {
                score = sumChars;
                retWord = i;
            }
        }

        return retWord;
    }
}
