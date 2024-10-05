//На вершине лесенки, содержащей N ступенек, находится мячик, который начинает прыгать по ним вниз, к основанию.
//Мячик может прыгнуть на следующую ступеньку, на ступеньку через одну или через две.
//Например, если пронумеровать ступеньки сверху вниз, а мячик лежит на 5-ой ступеньке,
//то он может переместиться с неё на 6-ую, 7-ую или 8-ую.
//Определить число всевозможных "маршрутов" мячика на землю.
//Входные данные:
//  Одно целое число N (1≤N≤40).
//Выходные данные:
//  Выведите одно целое число – количество маршрутов

package tasks;
import java.util.*;

public class The_ball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        long[] routes = new long[N + 1];

        routes[0] = 1;
        routes[1] = 1;

        for (int i = 2; i <= N; i++) {
            routes[i] = routes[i - 1] + routes[i - 2];
            if (i >= 3) {
                routes[i] += routes[i - 3];
            }
        }

        System.out.println(routes[N]);
        scanner.close();
    }
}
