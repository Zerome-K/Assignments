package zohoSets.set38;

import java.util.Scanner;

public class WordFormation {
    public static void main(String[] args) {
        WordFormation wf = new WordFormation();
        wf.init();
    }

    private void init() {
        System.out.print("ENTER NUM : ");
        String num = new Scanner(System.in).next();
        printWords(num, "");
    }

    private void printWords(String num, String res) {
        if (num.length() == 0) {
            System.out.println(res);
            return;
        }
        char ch = num.charAt(0);
        printWords(num.substring(1), res + (char)('A' + (ch - '1')));
        if (num.length() >= 2) {
            int ascii = Integer.parseInt(num.substring(0, 2));
            if(10 <= ascii && ascii <= 26)printWords(num.substring(2),res + (char)('A' + ascii-1));
        }
    }
}
/*
I/P : 1123
O/P : {1, 1, 2, 3} = aabc
      {11, 2, 3} = kbc
      {1, 1, 23} = aaw
      {11, 23}   = kw
 */