package zohoSets.set38;

import java.util.Scanner;

public class DistinctString {

    public static void main(String[] args) {
        DistinctString distinctString = new DistinctString();
        distinctString.init();
    }

    private void init() {
        System.out.print("ENTER STRING : ");
        String str = new Scanner(System.in).next();
        System.out.println("RESULT : " + makeDistinct(str));
    }

    private String makeDistinct(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (res.length() == 0) res += str.charAt(i);
            else if (res.charAt(res.length() - 1) != str.charAt(i))
                res += str.charAt(i);
        }
        return res;
    }
}
/*
I/P : aaabbcc
O/P : abc
 */