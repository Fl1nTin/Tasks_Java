package tasks;

/*Напишите функцию, которая принимает положительный параметр num и возвращает его мультипликативную настойчивость,
то есть количество раз, которое вы должны умножить цифры в num, пока не достигнете единственной цифры.
39 --> 3 (because 3*9 = 27, 2*7 = 14, 1*4 = 4)*/

public class Persistent_Bugger {
    public static int persistence(long num) {
        if (num < 10)
            return 0;

        int multi = 1;
        while (num > 0) {
            multi *= num % 10;
            num /= 10;
        }

        return 1 + persistence(multi);
    }
}
