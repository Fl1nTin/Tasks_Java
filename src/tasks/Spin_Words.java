package tasks;

/*Напишите функцию, которая принимает строку из одного или нескольких слов и возвращает ту же строку,
но со всеми пятью или более буквенными словами наоборот.
Передаваемые строки будут состоять только из букв и пробелов.
Пробелы будут включены только в том случае, если присутствует более одного слова.*/

public class Spin_Words {
    public static String spinWords(String sentence) {
        for (String i : sentence.split(" ")) {
            if (i.length() > 4)
                sentence = sentence.replace(i, new StringBuilder(i).reverse());
        }
        return sentence;
    }
}
