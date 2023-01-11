package zohoSets.set18;

public class FindMultiplication {

    public static void main(String[] args) {
        FindMultiplication findMultiplication = new FindMultiplication();
        findMultiplication.init();
    }

    private void init() {
        int a = 3, b = 12;
        int mul = multiply(a, b);
        System.out.println(mul);
//        if (a < b)
//            System.out.print(count(mul, b));
//        else System.out.println(count(mul, a));
        System.out.println(divideBy2(10));
    }

    private int divideBy2(int num) {
        if (num < 4) return 0;
        return 1 + divideBy2(num - 4);
    }

    private int count(int mul, int b) {
        int count = 0, sum = b;
        while (sum < mul) {
            count++;
            sum += b;
        }
        return count;
    }

    private int multiply(int a, int b) {
        if (b == 0) return 0;
        if (b > 0)
            return a + multiply(a, b - 1);
        if (b < 0)
            return -multiply(a, -b);
        return -1;
    }
}

/*
I/P : 3 x 4
O/P : 12
 */