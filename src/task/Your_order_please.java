package task;

/*Ваша задача - отсортировать заданную строку.
Каждое слово в строке будет содержать одно число.
Это число - позиция, которую слово должно занимать в результате.
Примечание: Числа могут быть от 1 до 9. Таким образом, 1 будет первым словом (а не 0).
Если входная строка пуста, верните пустую строку.
Слова во входной строке будут содержать только допустимые последовательные числа.*/

public class Your_order_please {
    public static String order(String words){
        String[] arr = words.split(" ");
        StringBuilder newStr = new StringBuilder();

        for (int i = 1; i < arr.length + 1; i++) {
            for (String c : arr){
                if (c.contains(String.valueOf(i)))
                    newStr.append(c + " ");
            }
        }

        return newStr.toString().trim();
    }
}
