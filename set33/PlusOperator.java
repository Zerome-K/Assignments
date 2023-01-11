package zohoSets.set33;

import java.util.Arrays;
import java.util.Scanner;

public class PlusOperator {
    public static void main(String[] args) {
        PlusOperator po = new PlusOperator();
        po.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] res = new int[4];
        res[0] = add(a, b);
        res[1] = sub(a, b);
        res[2] = mul(a, b);
        res[3] = div(a, b);
        System.out.println(Arrays.toString(res));
    }

    private int div(int a, int b) {
        int count = 0;
        int x = Math.abs(a), y = Math.abs(b);
        while (y > 0) {
            count++;
            y -= x;
        }
        if (a < 0 && b < 0 || a > 0 && b > 0)
            return count;
        return -count;
    }

    private int mul(int a, int b) {
        int sum = 0, temp = Math.abs(b);
        while (temp-- > 0) sum += a;
        if (a < 0 && b < 0 || a > 0 && b > 0)
            return -sum;
        return sum;
    }

    private int sub(int a, int b) {
        if (a < 0 && b < 0 || a > 0 && b > 0)
            return a + (-b);
        return a + b;
    }

    private int add(int a, int b) {
        if (a < 0 && b < 0 || a > 0 && b > 0)
            return a + b;
        return a + (-b);
    }
}
