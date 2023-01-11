package zohoSets.set39;

import java.util.Scanner;

public class Pangram {

    public static void main(String[] args) {
        Pangram pangram = new Pangram();
        pangram.init();
    }

    private void init() {
        System.out.print("ENTER STRING : ");
        String str = new Scanner(System.in).nextLine();
        System.out.print(isPangram(str) ? "TRUE" : "FALSE");
    }

    private boolean isPangram(String str) {
        int[] tab = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') continue;
            if ('a' <= ch && ch <= 'z') tab[ch - 'a']++;
            else tab[ch - 'A']++;
        }
        for (int x : tab)
            if (x < 1) return Boolean.FALSE;
        return Boolean.TRUE;
    }
}
/*
Check whether all english alphabets are present in the given sentence or not

I/P: abc defGhi JklmnOP QRStuv wxyz
O/P: True

I/P: abc defGhi JklmnOP QRStuv
O/P: False
 */