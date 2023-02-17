package tasks;

/*Некоторые числа обладают забавными свойствами. Например:
89 --> 8¹ + 9² = 89 * 1
695 --> 6² + 9³ + 5⁴= 1390 = 695 * 2
46288 --> 4³ + 6⁴+ 2⁵ + 8⁶ + 8⁷ = 2360688 = 46288 * 51

Дано положительное целое число n и положительное целое число p, мы хотим найти целое положительное число k,
если оно существует, такое, чтобы сумма цифр n, взятых в последовательных степенях p, была равна k * n.
Другими словами:
Существует ли целое число k, такое как : (a ^ p + b ^ (p + 1) + c ^ (p + 2) + d ^ (p + 3) + ...) = n * k
Если это так, мы вернем k, если нет, вернем -1.*/

public class Playing_With_Digits {
    public static long digPow(int n, int p) {
        p += Math.ceil(Math.log10(n));
        int temp = n;
        long res = 0;
        while (temp > 0) {
            res += Math.pow(temp % 10, --p);
            temp /= 10;
        }

        return (res % n == 0) ? res / n: -1;
    }
}
