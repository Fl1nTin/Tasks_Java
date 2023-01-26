package tasks;

/*Напишите решение так, чтобы оно разбило строку на пары по два символа.
Если строка содержит нечетное количество символов,
то она должна заменить отсутствующий второй символ последней пары символом подчеркивания ('_').
* 'abc' =>  ['ab', 'c_']
* 'abcdef' => ['ab', 'cd', 'ef']*/
public class String_Split {
    public static String[] solution(String s) {
        String[] strings = new String[(int)Math.ceil(s.length() / 2.)];
        for (int i = 0, k = 0; i < s.length(); i+=2, ++k) {
            if (i == s.length() - 1)
                strings[k] = s.substring(i) + "_";
            else
                strings[k] = s.substring(i, i + 2);
        }
        return strings;
    }
}
