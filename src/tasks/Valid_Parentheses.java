package tasks;

/*Напишите функцию, которая принимает строку круглых скобок и определяет, является ли порядок круглых скобок допустимым.
Функция должна возвращать true, если строка допустима, и false, если она недопустима.*/

public class Valid_Parentheses {
    public static boolean validParentheses(String parens) {
        int count = 0;
        for (int i = 0; i < parens.length(); i++) {
            if (parens.charAt(i) == '(')
                ++count;
            if (parens.charAt(i) == ')')
                --count;
            if (count < 0)
                return false;
        }
        return count == 0;
    }
}
