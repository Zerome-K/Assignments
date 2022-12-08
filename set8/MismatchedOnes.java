package zohoSets.set8;

import java.util.Scanner;

public class MismatchedOnes {

    public static void main(String[] args) {
        MismatchedOnes mismatchedOnes = new MismatchedOnes();
        mismatchedOnes.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER STRING 1 : ");
        String str = scanner.next();
        System.out.println("ENTER STRING 2 : ");
        String str1 = scanner.next();
        findMismatch(str, str1);
    }

    private void findMismatch(String str, String str1) {
        System.out.println("-MISMATCHED CHARACTERS-");
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) != str1.charAt(i))
                System.out.println(str.charAt(i) + " " + str1.charAt(i));
    }
}
