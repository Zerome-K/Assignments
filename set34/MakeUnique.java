package zohoSets.set34;

import java.util.Scanner;

public class MakeUnique {

    public static void main(String[] args) {
        MakeUnique mu = new MakeUnique();
        mu.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        System.out.println("RESULT : " + remove(s1, s2));
    }

    private String remove(String s1, String s2) {
        char[] arr = s1.toCharArray();
        String res = "";
        for (char c : arr) {
            if (!present(c, s2))
                continue;
            res += c;
        }
        return res;
    }

    private boolean present(char c, String s2) {
        for (int i = 0; i < s2.length(); i++) if (s2.charAt(i) == c) return Boolean.FALSE;
        return Boolean.TRUE;
    }
}
/*
I/P : s1 = ”expErIence”, s2=”En”
O/P : s1 = ”exprIece”
 */