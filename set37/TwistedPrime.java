package zohoSets.set37;

import java.util.Scanner;
public class TwistedPrime {

    public static void main(String[] args) {
        TwistedPrime twistedPrime = new TwistedPrime();
        twistedPrime.init();
    }

    private void init() {
        System.out.print("ENTER NUMBER : ");
        int num = new Scanner(System.in).nextInt();
        isTwistedPrime(num);
    }

    private void isTwistedPrime(int num) {
        if (!isPrime(num)) {
            System.out.print("NOT PRIME");
            return;
        }
        int rev = 0;
        while (num > 0) {
            rev = (rev * 10) + num % 10;
            num /= 10;
        }
        System.out.println(isPrime(rev) ? "PRIME" : "NOT PRIME");
    }

    private boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        int start = 5;
        for (; start * start <= n; start += 6) if (n % start == 0 || n % (start + 2) == 0) return false;
        return Boolean.TRUE;
    }
}
/*
I/P : 97
O/P : Twisted Prime Number
EXP : 97 is a prime number and its reverse 79 is also a prime number.
 */