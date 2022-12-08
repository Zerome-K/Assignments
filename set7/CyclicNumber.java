package zohoSets.set7;

import java.util.Scanner;

public class CyclicNumber {

    public static void main(String[] args) {
        CyclicNumber cyclicNumber = new CyclicNumber();
        cyclicNumber.init();
    }

    private void init() {
        System.out.print("ENTER NUMBER : ");
        int num = new Scanner(System.in).nextInt();
        System.out.println(isCyclic(num) ?
                "GIVEN NUMBER IS CYCLIC" :
                "GIVEN NUMBER IS NON-CYCLIC");
    }

    private boolean isCyclic(int num) {

        int digit = num % 10, count = 0, N = num;
        boolean isSame = Boolean.TRUE;
        while (N > 0) {
            count++;
            if (N % 10 != digit)
                isSame = Boolean.FALSE;
            N /= 10;
        }

        if (isSame) return Boolean.FALSE;

        if ((count & 1) == 0) {
            int split = (int) Math.pow(10, count / 2);
            int firstHalf = num / split;
            int secondHalf = num % split;
            if (firstHalf == secondHalf && isCyclic(secondHalf)) return Boolean.FALSE;
        }

        N = num;
        while (true) {
            int rem = N % 10;
            int newNum = (int) (rem * Math.pow(10, count - 1)) + N / 10;
            if (newNum == num) return Boolean.TRUE;
            if (newNum % num != 0) return Boolean.FALSE;
            N = newNum;
        }
    }
}
