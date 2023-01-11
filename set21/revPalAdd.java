package zohoSets.set21;

import java.util.Scanner;


public class revPalAdd {
    public static void main(String[] args) {
        revPalAdd rva = new revPalAdd();
        rva.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER NUMBER A : ");
        int a = scanner.nextInt();
        System.out.println(makePallindrome(a));
    }

    private int makePallindrome(int a) {
        int temp = 0;
        for (int i = 0; i < 5; i++) {
            temp = a + reverseNum(a);
            a = temp;
            if (isPallindrome(temp)) return temp;
        }
        return -1;
    }

    private boolean isPallindrome(int rev) {
        return rev == reverseNum(rev);
    }

    private int reverseNum(int a) {
        int res = 0;
        while (a > 0) {
            res = (res * 10) + a % 10;
            a /= 10;
        }
        return res;
    }
}
/*
Input : n = 32
Output : 55
23 + 32 = 55 which is a palindrome.

Input : 39
Output : 363
 */
