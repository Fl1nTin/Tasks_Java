//На расстоянии n шагов от магазина стоит А.
//Каждую минуту он выбирает, куда сделать шаг: к магазину или в противоположном направлении.
//Требуется написать программу, которая определит, сколькими способами А может попасть в магазин,
//пройдя ровно k шагов и оказавшись в магазине только после выполнения последнего шага.
//Входные данные:
//  Два числа n и k, записанные через пробел (1≤n≤k≤37).
//Выходные данные:
//  Одно целое число – количество способов попадания в магазин

package tasks;

import java.util.*;

public class At_the_store {
    static int[][] memory;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] i = input.nextLine().split(" ");
        int shop = Integer.parseInt(i[0]);
        int count = Integer.parseInt(i[1]);
        memory = new int[count][count];

        int a = p(count, shop);
        System.out.println(a);
    }

    public static int p(int count, int shop) {
        if (count == shop) {
            return 1;
        }
        if (count == shop + 2) {
            return shop;
        } else {
            int b = pp(count, shop);
            return b;
        }
    }

    public static int pp(int count, int shop) {
        if (shop == 0 || shop > count) {
            return 0;
        }
        if (memory[count - 1][shop - 1] == 0) {
            if (shop == count - 4) {
                int s = (int) ((shop + 3) * (shop / 2.0));
                memory[count - 1][shop - 1] = s;
                return s;
            } else {
                int s = pp(count - 1, shop + 1) + pp(count - 1, shop - 1);
                memory[count - 1][shop - 1] = s;
                return s;
            }
        } else {
            return memory[count - 1][shop - 1];
        }
    }
}
