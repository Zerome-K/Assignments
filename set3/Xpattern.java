package zohoSets.set3;

import java.util.Scanner;

public class Xpattern {

    public static void main(String[] args) {
        Xpattern x = new Xpattern();
        x.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER STRING : ");
        String str = scanner.next();
        printPattern(str);
    }

    private void printPattern(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (i == j || str.length()-i-1 == j)
                    System.out.print(str.charAt(j));
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
