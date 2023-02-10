package tasks;

import java.util.*;

/*Ваша задача — написать функцию для расчета общего времени, необходимого всем покупателям для оформления заказа!
Вход:
клиенты - массив положительных целых чисел, представляющих очередь. Каждое целое число представляет покупателя,
а - его значение — количество времени, которое ему требуется для оформления заказа.
n - положительное целое число, количество касс.
Выход:
Функция должна возвращать целое число — общее требуемое время.
Уточнения:
Порядок очереди НИКОГДА не меняется.
Первый человек в очереди переходит к кассе, как только она освобождается.*/

public class The_Supermarket_Queue {
    public static int solveSuperMarketQueue(int[] customers, int n) {
        ArrayList<Integer> arr = new ArrayList<>(Collections.nCopies(n, 0));

        for (int i = 0; i < customers.length; ++i){
            int indexMin = arr.indexOf(Collections.min(arr));
            arr.set(indexMin, arr.get(indexMin) + customers[i]);
        }

        return Collections.max(arr);
    }
}
