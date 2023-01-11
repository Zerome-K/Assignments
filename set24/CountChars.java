package zohoSets.set24;

import java.util.Scanner;

public class CountChars {

    public static void main(String[] args) {
        CountChars countChars = new CountChars();
        countChars.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER STRING : ");
        String str = scanner.next();
        System.out.print("ENTER CHAR : ");
        char ch = scanner.next().charAt(0);
        System.out.println("COUNT : " + countCharacter(str, ch));
    }

    private int countCharacter(String str, char a) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                int j = i;
                while (j < str.length() && str.charAt(j) == a) j++;
                count++;
                i = j;
            }
        }
        return count;
    }
}

/*
I/P : abaaaaabcaaacded, 'a';
O/P : 3
 */