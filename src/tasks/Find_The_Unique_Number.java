package tasks;

import java.util.*;

/*Существует массив с некоторыми числами.
Все числа равны, за исключением одного. Попробуй найти его!
Гарантируется, что массив содержит не менее 3 чисел.*/

public class Find_The_Unique_Number {
    public static double findUniq(double[] arr) {
        Arrays.sort(arr);
        return arr[0] == arr[1] ? arr[arr.length - 1] : arr[0];
    }
}
