package task;

//Вам предлагается возвести в квадрат каждую цифру числа и объединить их.

public class Square_Every_Digit {
    public int squareDigits(int n) {
        if (n < 1)
            return 0;

        StringBuffer res = new StringBuffer();
        int a = 0;
        while(n > 0) {
            a = n % 10;
            n /= 10;
            res.insert(0, a * a);
        }

        return Integer.parseInt(res.toString());
    }
}
