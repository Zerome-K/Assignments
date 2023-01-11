package zohoSets.set37;

import java.util.Scanner;

public class IsPallindrome {

    public static void main(String[] args) {
        IsPallindrome isPallindrome = new IsPallindrome();
        isPallindrome.init();
    }

    private void init() {
        System.out.println("ENTER STRING : ");
        String S = new Scanner(System.in).nextLine();
        System.out.println(isPalindrome(S));
    }

    private int isPalindrome(String S) {

        int i = 0, j = S.length() - 1;
        while (i <= j) {
            if (S.charAt(i) != S.charAt(j)) return 0;
            i++;
            j--;
        }
        return 1;
    }
}
/*
I/P : RACE CAR
O/P : TRUE
 */