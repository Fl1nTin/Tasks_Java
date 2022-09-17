package task;

//Ваша задача - написать функцию, которая преобразует все символы, кроме последних четырех, в '#'.

public class Credit_Card_Mask {
    public static String maskify(String str) {
        if (str.length() < 4)
            return str;

        String ss = "";
        for (int i = 0; i < str.length() - 4; i++) {
            ss += "#";
        }

        return ss += str.substring(str.length() - 4);
    }
}
