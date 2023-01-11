package zohoSets.set15;

import java.util.Scanner;

public class ReverseRecursion {

    public static void main(String[] args) {
        ReverseRecursion reverseRecursion = new ReverseRecursion();
        reverseRecursion.init();
    }

    private void init() {
        System.out.print("ENTER STRING : ");
        String string = new Scanner(System.in).nextLine();
        System.out.println(reverseRecur(string, string.length() - 1, ""));
    }

    private String reverseRecur(String str, int idx, String result) {

        if (idx < 0) return result;

        if (str.charAt(idx) != ' ')
            result = str.charAt(idx) + result;
        else
            return result + " " + reverseRecur(str, idx - 1, "");

        return reverseRecur(str, idx - 1, result);
    }
}
/*
I/P :  one two three
O/P :  three two one
 */