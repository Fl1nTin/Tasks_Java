package tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Ваша цель - реализовать функцию разности,
которая вычитает один список из другого и возвращает результат.
Она должна удалить все значения из списка 'a', которые присутствуют в списке 'b', сохраняя их порядок.
Если значение присутствует в 'b', то все его вхождения должны быть удалены из другого списка.*/

public class Array_Diff {
    public static int[] arrayDiff(int[] a, int[] b) {
        if (a == null || b == null)
            return a;

        List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());
        listA.removeAll(listB);

        return listA.stream().mapToInt(value -> value).toArray();
    }
}
