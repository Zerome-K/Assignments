package zohoSets.set1;

public class CheckValidSudoku {

    public static void main(String[] args) {
        CheckValidSudoku cvs = new CheckValidSudoku();
        cvs.init();
    }

    private void init() {

        int[][] sudukoMatrix = {
                {5, 1, 3, 6, 8, 7, 2, 4, 9},
                {8, 4, 9, 5, 2, 1, 6, 3, 7},
                {2, 6, 7, 3, 4, 9, 5, 8, 1},
                {1, 5, 8, 4, 6, 3, 9, 7, 2},
                {9, 7, 4, 2, 1, 8, 3, 6, 5},
                {3, 2, 6, 7, 9, 5, 4, 1, 8},
                {7, 8, 2, 9, 3, 4, 1, 5, 6},
                {6, 3, 5, 1, 7, 2, 8, 9, 4},
                {4, 9, 1, 8, 5, 6, 7, 2, 3}
        };

        if(check(sudukoMatrix))
            System.out.println("GIVEN SUDOKU IS VALID");
        else System.out.println("GIVEN SUDOKU IS INVALID");
    }

    private boolean check(int[][] sudukoMatrix) {

        for (int i = 0; i < sudukoMatrix.length; i++) {
            for (int j = 0; j < sudukoMatrix[0].length; j++) {
                boolean valid = isValid(sudukoMatrix, i, j);
                if (!valid) return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

    private boolean isValid(int[][] sudukoMatrix, int row, int col) {

        int num = sudukoMatrix[row][col];

        for (int k = 0; k < sudukoMatrix[0].length; k++) {
            if (k != col)
                if (sudukoMatrix[row][k] == num) return Boolean.FALSE;
        }

        for (int i = 0; i < sudukoMatrix.length; i++) {
            if (row != i)
                if (sudukoMatrix[i][col] == num) return Boolean.FALSE;
        }

        int startingRow = (int) (row - row % Math.sqrt(sudukoMatrix.length));
        int startingCol = (int) (col - col % Math.sqrt(sudukoMatrix.length));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((startingRow + i != row) && (startingCol + j != col))
                    if (sudukoMatrix[startingRow + i][startingCol + j] == num)
                        return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }
}
