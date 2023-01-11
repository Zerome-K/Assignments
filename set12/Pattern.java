package zohoSets.set12;

import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {
        Pattern pattern = new Pattern();
        pattern.init();
    }

    private void init() {
        System.out.print("ENTER NUMBER : ");
        int n = new Scanner(System.in).nextInt();
        printPattern(n);
    }

    private void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            int num = n + i;
            for (int j = n-1; j >= i; j--) {
                System.out.print(num + " ");
                num += j;
            }
            System.out.println();
        }
    }
}
