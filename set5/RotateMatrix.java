package zohoSets.set5;

import java.util.Arrays;

public class RotateMatrix {

    public static void main(String[] args) {
        RotateMatrix rotateMatrix = new RotateMatrix();
        rotateMatrix.init();
    }

    private void init() {
        int[][] arr = {
                {1, 2, 3, 4, 45},
                {5, 6, 7, 8, 55},
                {9, 10, 11, 12, 65},
                {44, 33, 22, 77, 88},
                {13, 14, 15, 16, 75}
        };

        rotate(arr);
        System.out.println("     | ROTATED |");
        display(arr);
    }

    private void rotate(int[][] arr) {

        int iteration = 0, rows = arr.length, cols = arr[0].length;

        while (iteration < cols / 2) {

            int first = arr[iteration][iteration];

            for (int i = iteration; i < rows - 1 - iteration; i++) {
                arr[i][iteration] = arr[i + 1][iteration];
            }

            for (int i = iteration; i < cols - 1 - iteration; i++) {
                arr[rows - 1 - iteration][i] = arr[rows - 1 - iteration][i + 1];
            }

            for (int i = rows - 1 - iteration; i > iteration; i--) {
                arr[i][cols - 1 - iteration] = arr[i - 1][cols - 1 - iteration];
            }

            for (int i = cols - 1 - iteration; i > iteration + 1; i--) {
                arr[iteration][i] = arr[iteration][i - 1];
            }

            arr[iteration][iteration + 1] = first;

            iteration++;
        }
    }

    public void display(int[][] arr) {
        for (int[] a : arr) System.out.println(Arrays.toString(a));
    }
}

/*
For 4*4 matrix

Input:
1    2    3    4
5    6    7    8
9    10    11    12
13    14    15    16

Output:
5    1    2    3
9    10    6    4
13    11    7    8
14    15    16    12
 */