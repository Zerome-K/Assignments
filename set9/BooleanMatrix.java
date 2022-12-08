package zohoSets.set9;

import java.util.Arrays;

public class BooleanMatrix {

    public static void main(String[] args) {
        BooleanMatrix booleanMatrix = new BooleanMatrix();
        booleanMatrix.init();
    }

    private void init() {
        boolean[][] matrix = {
                {true, false, false, true},
                {false, false, true, false},
                {false, false, false, false},
                {false, false, false, false}};

        play1(matrix);
        for (boolean[] x : matrix) {
            System.out.println(Arrays.toString(x));
        }
    }

    private void play(boolean[][] matrix) {

        boolean[] row = new boolean[matrix.length];
        boolean[] col = new boolean[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j]) {
                    row[i] = Boolean.TRUE;
                    col[j] = Boolean.TRUE;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (row[i] || col[j]) matrix[i][j] = Boolean.TRUE;
            }
        }

        for (boolean[] x : matrix) {
            System.out.println(Arrays.toString(x));
        }
    }

    private void play1(boolean[][] matrix) {

        boolean rowSwitch = Boolean.FALSE;
        boolean colSwitch = Boolean.FALSE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[0][j]) colSwitch = Boolean.TRUE;
                if (matrix[i][0]) rowSwitch = Boolean.TRUE;
                if (matrix[i][j]) {
                    matrix[0][j] = Boolean.TRUE;
                    matrix[i][0] = Boolean.TRUE;
                }
            }
        }

        for (int row = 1; row < matrix.length; row++) {
            for (int col = 1; col < matrix[0].length; col++) {
                if (matrix[row][0]) matrix[row][col] = Boolean.TRUE;
                else if (matrix[0][col]) matrix[row][col] = Boolean.TRUE;
            }
        }

        if (rowSwitch)
            for (int i = 0; i < matrix[0].length; i++) matrix[0][i] = Boolean.TRUE;

        if (colSwitch)
            for (int i = 0; i < matrix.length; i++) matrix[i][0] = Boolean.TRUE;
    }
}

/*
Input:     {{1, 0, 0, 1},
           {0, 0, 1, 0},
           {0, 0, 0, 0}}

Output:    {{1, 1, 1, 1},
           {1, 1, 1, 1},
           {1, 0, 1, 1}}

PLAY METHOD - Time Complexity: O(M*N), Traversing over the matrix two times.
       Auxiliary Space: O(M + N), Taking two arrays one of size M and another of size N.
 */