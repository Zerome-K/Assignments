package zohoSets.set13;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {
        StringReverse stringReverse = new StringReverse();
        stringReverse.init();
    }

    private void init() {
        System.out.print("ENTER STRING : ");
        String str = new Scanner(System.in).nextLine();
        reverse(str);
    }

    private void reverse(String str) {
        int start = 0, end = str.length() - 1;
        char[] charArray = str.toCharArray();
        while (start < end) {
            char s = str.charAt(start), e = str.charAt(end);
            if (!(('a' <= s && s <= 'z') || ('A' <= s && s <= 'Z') || ('0' <= s && s <= '9')))
                start++;
            else if (!(('a' <= e && e <= 'z') || ('A' <= e && e <= 'Z') || ('0' <= e && e <= '9')))
                end--;
            else {
                char temp = charArray[start];
                charArray[start] = charArray[end];
                charArray[end] = temp;
                start++;
                end--;
            }
        }

        System.out.println("REVERSE STRING : ");
        for (char ch : charArray) {
            System.out.print(ch);
        }
    }
}
