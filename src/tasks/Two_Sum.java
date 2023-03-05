package tasks;
/*Напишите функцию, которая принимает массив чисел и целевое число.
Должно найти два разных элемента в массиве, которые при сложении вместе дают целевое значение.
Индексы этих элементов должны быть возвращены в виде кортежа.*/

public class Two_Sum {
    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target)
                    return new int[]{i, j};
            }
        }

        return null;
    }
}