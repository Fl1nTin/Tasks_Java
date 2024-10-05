//Изначально имелось n целых чисел. Затем одно из них удалили, а после этого удалили ещё одно.
//Определите, какие именно два числа были удалены.
//Входные данные:
//  Первая строка входных данных содержит целое число n (3≤n≤1053≤n≤105) — изначальное количество чисел.
//  Вторая строка содержит n целых чисел через пробел — изначальные числа.
//  Третья строка содержит (n−1)(n−1) целых чисел через пробел — числа, оставшиеся после первого удаления.
//  Четвертая строка содержит (n−2)(n−2) целых чисел через пробел — числа, оставшиеся после второго удаления.
//  Все вводимые числа лежат в диапазоне от 11 до 109109.
//Выходные данные:
//  Выведите два числа, которые были удалены — сначала первое удалённое число, затем второе.

package tasks;
import java.util.*;

public class Two_deletions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }

        List<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            arr2.add(scanner.nextInt());
        }
        arr.sort((o1, o2) -> o1.compareTo(o2));
        arr2.sort((o1, o2) -> o1.compareTo(o2));
        int a = missing(arr, arr2);

        List<Integer> arr3 = new ArrayList<>();
        for (int i = 0; i < n - 2; i++) {
            arr3.add(scanner.nextInt());
        }
        arr3.sort((o1, o2) -> o1.compareTo(o2));
        int b = missing(arr2, arr3);

        System.out.println(a);
        System.out.println(b);
    }

    private static int missing(List<Integer> arr1, List<Integer> arr2) {
        int miss = arr1.get(0);
        for (int i = 1; i < arr1.size(); i++) {
            miss ^= arr1.get(i);
        }
        for (int i = 0; i < arr2.size(); i++) {
            miss ^= arr2.get(i);
        }
        return miss;
    }
}
