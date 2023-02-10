package tasks;

import java.util.Arrays;

/*Напишите функцию, которая принимает массив из 10 целых чисел (от 0 до 9),
который возвращает строку из этих чисел в виде номера телефона. -> return "(123) 456-7890"*/

public class Create_Phone_Number {
    public static String createPhoneNumber(int[] numbers) {
        String s = Arrays.toString(numbers).replaceAll("[ ,\\[\\]]", "");
        return "(" + s.substring(0, 3) + ") " +
                    s.substring(3, 6) + "-" +
                    s.substring(6);
    }
}
