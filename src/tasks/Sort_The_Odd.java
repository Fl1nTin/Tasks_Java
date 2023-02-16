package tasks;

/*Вам будет выдан массив чисел.
Вы должны отсортировать нечетные числа в порядке возрастания, оставив четные числа на их первоначальных позициях.
[5, 8, 6, 3, 4]  =>  [3, 8, 6, 5, 4]
[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]  =>  [1, 8, 3, 6, 5, 4, 7, 2, 9, 0]*/

public class Sort_The_Odd {
    public static int[] sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i] && array[j] % 2 != 0 && array[i] % 2 != 0) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }

        return array;
    }
}
