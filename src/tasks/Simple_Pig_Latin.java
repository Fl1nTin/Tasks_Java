package tasks;

/*Переместите первую букву каждого слова в его конец, затем добавьте "ay" в конец слова.
Оставьте знаки препинания нетронутыми.*/

public class Simple_Pig_Latin {
    public static String pigIt(String str) {
        StringBuilder builder = new StringBuilder();
        for (String s : str.split(" ")) {
            if (s.matches("[a-zA-Z]+")) {
                String newS = s.substring(1, s.length()) + s.charAt(0) + "ay";
                builder.append(newS).append(" ");
            } else
                builder.append(s);
        }
        return builder.toString().trim();
    }
}
