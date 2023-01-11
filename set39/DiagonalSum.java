package zohoSets.set39;

import java.util.Scanner;

public class DiagonalSum {

    public static void main(String[] args) {
        DiagonalSum diagonalSum = new DiagonalSum();
        diagonalSum.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER ROWS : ");
        int rows = scanner.nextInt();
        System.out.print("ENTER COLS : ");
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];
        int totalSum = 0, diagonal = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
                totalSum += matrix[i][j];
                if (cols - 1 - i == j) diagonal += matrix[i][j];
            }
        }
        int left = maxDiagonal(matrix);
        System.out.println("MAX DIAGONAL : " + Math.max(left + diagonal, totalSum - left));

    }

    private int maxDiagonal(int[][] matrix) {
        int left = 0;
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length - 1 - i; j++)
                left += matrix[i][j];
        return left;
    }
}
/*
I/P :   ROWS : 4, COLS : 4
        [56, 67, 89, 89]
        [54, 90, 78, 91]
        [83, 4, 69, 72]
        [95, 56, 21, 42]

O/P : MAX : 705

 */