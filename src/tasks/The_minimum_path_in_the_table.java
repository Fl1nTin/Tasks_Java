//В прямоугольной таблице N×M (в каждой клетке которой записано некоторое число) вначале игрок находится в левой верхней клетке.
//За один ход ему разрешается перемещаться в соседнюю клетку либо вправо, либо вниз (влево и вверх перемещаться запрещено).
//При проходе через клетку с игрока берут столько у.е., какое число записано в этой клетке
//(деньги берут также за первую и последнюю клетки его пути). Требуется найти минимальную сумму у.е.,
//заплатив которую, игрок может попасть в правый нижний угол, а также путь игрока.
//Входные данные:
//  Во входных данных задано два числа N и M – размеры таблицы (1≤N≤20, 1≤M≤20).
//  Затем идет N строк по M чисел в каждой – размеры штрафов в у.е. за прохождение через соответствующие клетки (числа от 0 до 100).
//Выходные данные:
//  В первой строке выведите минимальную сумму, потратив которую, можно попасть в правый нижний угол.
//  После этого выведите строку, описывающую путь игрока. Строка должна содержать только символы R и D.
//  Символ R говорит о том, что на очередном шаге надо пойти вправо, а символ D – вниз.
//  В случае нескольких верных ответов выведите любой.

package tasks;
import java.util.*;

public class The_minimum_path_in_the_table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] grid = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }
        int[][] dp = new int[n][m];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < n; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
        for (int j = 1; j < m; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }
        System.out.println(dp[n - 1][m - 1]);
        printPath(dp, grid, n - 1, m - 1);
    }


    private static void printPath(int[][] dp, int[][] grid, int i, int j) {
        if (i == 0 && j == 0) {
            return;
        }
        if (i == 0) {
            printPath(dp, grid, i, j - 1);
            System.out.print("R");
        } else if (j == 0) {
            printPath(dp, grid, i - 1, j);
            System.out.print("D");
        } else {
            if (dp[i - 1][j] < dp[i][j - 1]) {
                printPath(dp, grid, i - 1, j);
                System.out.print("D");
            } else {
                printPath(dp, grid, i, j - 1);
                System.out.print("R");
            }
        }
    }
}