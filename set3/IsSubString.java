package zohoSets.set3;

import java.util.Scanner;

public class IsSubString {
    public static void main(String[] args) {
        IsSubString is = new IsSubString();
        is.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER STRING 1 : ");
        String str = scanner.next();
        System.out.print("ENTER STRING 2 : ");
        String str2 = scanner.next();
        System.out.println(isSub(str, str2));
    }

    private int isSub(String str, String str2) {
        int idx = 0;
        while (idx < str.length()) {
            int j = 0;
            while (str.charAt(idx + j) == str2.charAt(j)) {
                j++;
                if (j == str2.length()) return idx;
            }
            idx++;
        }
        return -1;
    }
}

/*
Eg 1:Input:
        String 1: test123string
        String 2: 123
        Output: 4
Eg 2: Input:
        String 1: testing12
        String 2: 1234
        Output: -1
 */