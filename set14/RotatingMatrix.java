package zohoSets.set14;

import java.util.Arrays;
import java.util.Scanner;

public class RotatingMatrix {

    private final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        RotatingMatrix rotatingMatrix = new RotatingMatrix();
        rotatingMatrix.init();
    }

    private void init() {

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        rotateMatrix(arr);
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }

    private void rotateMatrix(int[][] arr) {

        System.out.print("ENTER ROTATION DEGREE : ");
        int degree = scanner.nextInt();
        for (int i = 0; i < degree / 90; i++) {
            transpose(arr);
            swapColumn(arr);
        }
    }

    private void swapColumn(int[][] arr) {
        for (int i = 0; i < arr[0].length / 2; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[j][i] = arr[j][arr.length - 1 - i] + arr[j][i] -
                        (arr[j][arr.length - 1 - i] = arr[j][i]);
            }
        }
    }

    private void transpose(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                arr[i][j] = arr[i][j] + arr[j][i] - (arr[j][i] = arr[i][j]);
            }
        }
    }
}

/*
Write a program to rotate an n*n matrix 90,180,270,360 degree.
is the solution for rotating a matrix 90 degree. For rotating
the matrix 180,270,360 degree, u need to call the same method
2,3,4 times based on the input.
 */