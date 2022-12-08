package zohoSets.set3;

import java.util.Scanner;

public class RecurseReverseString {
    public static void main(String[] args) {
        RecurseReverseString rrs = new RecurseReverseString();
        rrs.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER STRING : ");
        String str = scanner.nextLine();
        System.out.println(reverse(str, 0));
    }

    private String reverse(String str, int j) {
        if (j >= str.length()) return "";
        String res = "";
        int i;
        for (i = j; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                break;
            else res += str.charAt(i);
        }
        return reverse(str, j + i) + " " + res;
    }
}
