package zohoSets.set21;

import java.util.Scanner;

public class PrimeAddition {
    public static void main(String[] args) {
        PrimeAddition primeAddition = new PrimeAddition();
        primeAddition.init();
    }

    private void init() {
        System.out.print("ENTER NUMBER : ");
        int num = new Scanner(System.in).nextInt();
        printPrime(num);
    }

    private void printPrime(int num) {
        boolean[] table = new boolean[num];
        for (int i = 2; i < num / 2; i++) {
            if (!table[i])
                for (int j = i + i; j < num; j += i)
                    table[j] = true;
        }

        int start = 2, end = num - 1, n;
        while (start < end) {
            n = start + end;
            if (!table[start] && !table[end]) {
                if (n > num) end--;
                else if (n < num) start++;
                else {
                    System.out.println(start + " " + end);
                    return;
                }
            } else if (table[start]) start++;
            else end--;
        }
    }
}
/*
I/P = 34
O/P = SUM OF TWO PRIMES
 */