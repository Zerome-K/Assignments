package zohoSets.set32;

import java.util.Arrays;
import java.util.Scanner;

public class LongestSubSeq {

    public static void main(String[] args) {
        LongestSubSeq longestSubSeq = new LongestSubSeq();
        longestSubSeq.init();
    }

    private void init() {
        System.out.print("ENTER STRING : ");
        String str = new Scanner(System.in).next();
        System.out.println("LONGEST SUBSTRING : " + findLongest(str));
    }

    private int findLongest(String str) {
        int res = -1;
        int[] tab = new int[26];
        Arrays.fill(tab,-1);
        for (int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i) - 'a';
            if (tab[idx] == -1) tab[idx] = i;
            else res = Math.max(res, i - 1 - tab[idx]);
        }
        return res;
    }
}
/*
EX 1 -  I/P : abcccccbba ; O/P - 8 (from a to a)
EX 2 -  I/P aaaaaaaa     ; O/P - 6
 */