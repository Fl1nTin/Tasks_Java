package tasks;

/*Ваша задача - отсортировать заданную строку.
Каждое слово в строке будет содержать одно число.
Это число - позиция, которую слово должно занимать в результате.
Примечание: Числа могут быть от 1 до 9. Таким образом, 1 будет первым словом (а не 0).
Если входная строка пуста, верните пустую строку.
Слова во входной строке будут содержать только допустимые последовательные числа.*/

public class Your_order_please {
    public static String order(String words){
        String[] array = words.split(" ");
        StringBuilder str = new StringBuilder();

        for (int i = 1; i < array.length + 1; i++) {
            for (String tempStr : array){
                if (tempStr.contains(String.valueOf(i)))
                    str.append(tempStr + " ");
            }
        }

        return str.toString().trim();
    }
}
