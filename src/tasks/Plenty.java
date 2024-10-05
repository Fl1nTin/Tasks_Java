//Вам требуется написать программу для работы со множеством целых чисел, реализующую следующие основные операции:
//Вставка элемента. Если элемент уже есть во множестве, оно не изменяется
//Удаление элемента. Если элемента нет во множестве, оно не изменяется определения размера множества,
//то есть количества элементов в нём
//Входные данные:
//  В первой строке входных данных записано целое число N– количество команд (1≤N≤105). В следующих N строках записана команда (add или del) и целое число, которое вставляется в множество (в случае команды add) или удаляется из множества (в случае команды del). Все элементы не превосходят по модулю 109
//Выходные данные:
//  Выведите N целых чисел – размер множества после вставки или удаления каждого элемента

package tasks;
import java.util.*;

public class Plenty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            String command = scanner.next();
            int number = scanner.nextInt();

            if (command.equals("add")) {
                set.add(number);
            } else if (command.equals("del")) {
                boolean remove = set.remove(number);
            }
            System.out.println(set.size());
        }
    }
}
