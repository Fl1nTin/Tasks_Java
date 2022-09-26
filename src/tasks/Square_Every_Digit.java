package tasks;

//Вам предлагается возвести в квадрат каждую цифру числа и объединить их.

public class Square_Every_Digit {
    public static int squareDigits(int n) {
        if (n < 1)
            return 0;

        StringBuffer result = new StringBuffer();
        int a = 0;
        while(n > 0) {
            a = n % 10;
            n /= 10;
            result.insert(0, a * a);
        }

        return Integer.parseInt(result.toString());
    }
}
