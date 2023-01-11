package zohoSets.set36;

import java.util.Scanner;

public class DiamondNumber {

    public static void main(String[] args) {
        DiamondNumber diamondNumber = new DiamondNumber();
        diamondNumber.init();
    }

    private void init() {
        System.out.print("ENTER NUM : ");
        int num = new Scanner(System.in).nextInt();
        printPattern(num);
    }

    private void printPattern(int row) {
        int num = 0;
        for (int i = 1; i <= row; i++) {
            for (int j = 0; j < row - i; j++) System.out.print(" ");
            num = (i * (i - 1) / 2) + i;
            for (int j = 0; j < i; j++) System.out.print(num - j + " ");
            System.out.println();
        }
        for (int i = row; i > 0; i--) {
            for (int j = 0; j < row - i; j++) System.out.print(" ");
            for (int j = 0; j < i; j++) System.out.print(num-- + " ");
            System.out.println();
        }
    }
}
/*
I/P : 4

O/P :  1
      3 2
     6 5 4
    10 9 8 7
    10 9 8 7
     6 5 4
      3 2
       1
 */
