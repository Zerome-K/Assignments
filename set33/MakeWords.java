package zohoSets.set33;

import java.util.Scanner;

public class MakeWords {

    public static void main(String[] args) {
        MakeWords mk = new MakeWords();
        mk.init();
    }

    private void init() {
        System.out.print("ENTER NUM : ");
        String str = new Scanner(System.in).next();
        findWords(str, "");
    }

    private void findWords(String str, String res) {
        if (str.length() == 0) {
            System.out.println(res);
            return;
        }
        char ch = (char) ('A' + (str.charAt(0) - '1'));
        findWords(str.substring(1), res + ch);
        if (str.length() >= 2) {
            int dig = Integer.parseInt(str.substring(0, 2));
            if (10 <= dig && dig <= 26)
                findWords(str.substring(2), res + (char) ('A' + dig - 1));
        }
    }
}
/*
I/P : digits[] = “121”
O/P : 3 // The possible decodings are “ABA”, “AU”, “LA”

I/P : digits[] = “1234”
O/P : 3 // The possible decodings are “ABCD”, “LCD”, “AWD”
 */