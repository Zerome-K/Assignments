package zohoSets.set23;

import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        Pascal pascal = new Pascal();
        pascal.init();
    }

    private void init() {
        System.out.print("ENTER N : ");
        int N = new Scanner(System.in).nextInt();
        printPascal2(N);
    }

    private void printPascal1(int n) {

        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(binomial(row, col) + " ");
            }
            System.out.println();
        }
    }

    private int binomial(int N, int R) {
        int res = 1;
        if (R > N - R)
            R = N - R;
        for (int i = 0; i < R; i++) {
            res *= N - i;
            res /= i + 1;
        }
        return res;
    }

    private void printPascal2(int n) {
        int[][] tab = new int[n][n];
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                if (col == 0 || col == row)
                    tab[row][col] = 1;
                else tab[row][col] = tab[row - 1][col - 1] + tab[row - 1][col];
                System.out.print(tab[row][col] + " ");
                System.out.println();
            }
            System.out.println();
        }
    }
}
