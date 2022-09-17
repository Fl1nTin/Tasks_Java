package task;

//Напишите функцию, которая разбивает верблюжью оболочку, используя пробел между словами.

public class Break_camelCase {
    public static String camelCase(String input) {
        String str = "";
        for (char i : input.toCharArray()) {
            str += Character.isUpperCase(i) ? " " + i :  i;
        }
        return str;
    }
}
