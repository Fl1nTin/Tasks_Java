package tasks;

import java.util.Arrays;

/*Вам дается массив (который будет иметь длину не менее 3, но может быть очень большим), содержащий целые числа.
Массив либо полностью состоит из нечетных целых чисел,
либо полностью состоит из четных целых чисел, за исключением одного целого N.
Напишите метод, который принимает массив в качестве аргумента и возвращает эту N.*/

public class Find_The_Parity_Outlier {
    static int find(int[] integers) {
        int[] a = Arrays.stream(integers).filter(value -> value % 2 == 0).toArray();
        int[] b = Arrays.stream(integers).filter(value -> value % 2 != 0).toArray();

        return a.length == 1 ? a[0] : b[0];
    }
}
