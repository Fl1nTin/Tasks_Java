package tasks;

//Напишите функцию, которая разбивает верблюжью оболочку, используя пробел между словами.

public class Break_camelCase {
    public static String camelCase(String input) {
        String str = "";
        for (char ch : input.toCharArray()) {
            str += Character.isUpperCase(ch) ? " " + ch : ch;
        }
        return str;
    }
}
