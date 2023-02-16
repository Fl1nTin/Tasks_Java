package tasks;

/*Нарциссическое число (или число Армстронга) - это положительное число, представляющее собой сумму собственных цифр,
каждая из которых возведена в степень количества цифр.

Например: 153 является нарциссическим: 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
и 1652 не является: 1^4 + 6^4 + 5^4 + 2^4 = 1 + 1296 + 625 + 16 = 1938
Ваш код должен возвращать значение true или false в зависимости от того, является ли данное число нарциссическим.*/

public class Number_Utils {
    public static boolean isNarcissistic(int number) {
        double log = Math.ceil(Math.log10(number));
        int temp = number;
        int result = 0;
        while (temp > 0) {
            result += Math.pow(temp % 10, log);
            temp /= 10;
        }

        return number == result;
    }
}
