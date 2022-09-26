package tasks;

//Напишите функцию, которая разбивает верблюжью оболочку, используя пробел между словами.

public class Break_camelCase {
    public static String camelCase(String input) {
        StringBuilder sb = new StringBuilder();
        for (char ch : input.toCharArray()) {
            sb.append(Character.isUpperCase(ch) ? " " + ch : ch);
        }
        return sb.toString();
    }
}
