package zohoSets.set23;

import java.util.Arrays;

public class UniqueRows {

    public static void main(String[] args) {
        UniqueRows uniqueRows = new UniqueRows();
        uniqueRows.init();
    }

    private void init() {
        int[][] arr = {
                {2, 0, 3},
                {1, 5, 0},
                {5, 5, 5},
                {2, 0, 3}
        };
        printUnique(arr, arr.length, arr[0].length);
    }

    private void printUnique(int[][] a, int r, int c) {
        int[] table = new int[r];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                table[i] += a[i][j] * (int) Math.pow(2, j);
        for (int i = 0; i < r; i++) {
            for (int j = i + 1; j < r; j++) {
                if (table[i] == table[j]) table[j] = -1;
            }
        }
        for (int i = 0; i < r; i++) {
            if (table[i] >= 0)
                System.out.println(Arrays.toString(a[i]));
        }
    }
}
/*
Ex.  INPUT  :

    Enter Row Size    :  4
    Enter column size  :  3
    Enter the matrix  :
    1 0 1
    1 1 0
    1 1 1
    1 0 1

    OUTPUT  :
    Unique Matrix  :
    1 0 1
    1 1 0
    1 1 1
 */