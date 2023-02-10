package tasks;

/*Напишите функцию, которая принимает два числа и возвращает 1, если где-либо
в num1 есть последовательность из трех одинаковых цифр, а также двойная последовательность того же числа в num2.
Если это не так, верните 0*/

public class Triple_Trouble {
    public static int tripleDouble(long num1, long num2) {
        String oneNum = String.valueOf(num1);
        String s = "";
        for (int i = 2; i < oneNum.length(); i++) {
            if ((oneNum.charAt(i) == oneNum.charAt(i - 1)) && (oneNum.charAt(i) == oneNum.charAt(i - 2))){
                s = oneNum.substring(i - 2, i);
                break;
            }
        }

        if (s.length() < 2)
            return 0;

        String twoNum = String.valueOf(num2);
        return twoNum.contains(s)? 1 : 0;
    }
}
