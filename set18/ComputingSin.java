package zohoSets.set18;

import java.util.Scanner;

public class ComputingSin {

    public static void main(String[] args) {
        ComputingSin computingSin = new ComputingSin();
        computingSin.init();
    }

    private void init() {
        System.out.print("ENTER VALUE : ");
        float value = new Scanner(System.in).nextFloat();
        float radians = (float) (value * (Math.PI / 180));
//        System.out.println("SIN OF " + value + " : " + sin(radians));
        System.out.println(sine1(radians, 10));
    }

    private float sin(float value) {
        float result = 0.0f;
        for (int i = 1; i <= 10; i++) {
            int fact = 1;
            for (int j = 1; j <= 2 * i - 1; j++) fact *= j;
            float v = (float) Math.pow(value, 2 * i - 1) / fact;
            if ((i & 1) == 1) result += v;
            else result -= v;
        }
        return result;
    }

    private float sine1(float degree, int n) {

        float result = degree, xSquare = degree * degree, denominator = 1, numerator = degree;
        int sign = -1, factorial = 1;
        do {
            numerator *= xSquare;
            denominator *= (factorial + 1) * (factorial + 2);
            factorial += 2;
            float term = numerator / denominator;
            result += (term * sign);
            sign = -sign;
            n--;
        } while (n >= 0);
        return result;
    }
}
