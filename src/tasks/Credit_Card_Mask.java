package tasks;

//Ваша задача - написать функцию, которая преобразует все символы, кроме последних четырех, в '#'.

public class Credit_Card_Mask {
    public static String maskify(String str) {
        if (str.length() < 4)
            return str;

        String newStr = "";
        for (int i = 0; i < str.length() - 4; i++) {
            newStr += "#";
        }

        return newStr += str.substring(str.length() - 4);
    }
}
