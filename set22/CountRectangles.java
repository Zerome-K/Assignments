package zohoSets.set22;

public class CountRectangles {

    public static void main(String[] args) {
        CountRectangles countRectangles = new CountRectangles();
        countRectangles.init();
    }

    private void init() {
        int[][] matrix = {
                {1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1, 1},
                {0, 0, 1, 0, 0, 0, 1},
                {1, 0, 1, 1, 1, 1, 1},
                {0, 0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1, 1}
        };
        begin(matrix);
    }

    private void begin(int[][] matrix) {

        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1 && isRectangular(i, j, matrix))
                    count++;
            }
        }
        System.out.println("TOTAL RECTANGLES : " + count);
    }

    private boolean isRectangular(int row, int col, int[][] matrix) {

        int rowFlag = 0, colFlag = 0, i, j = 0;

        for (i = row; i < matrix.length; i++) {
            if (matrix[i][col] == 0) {
                rowFlag = 1;
                break;
            }
            if (matrix[i][col] == 5)
                continue;
            for (j = col; j < matrix[0].length; j++) {
                if (matrix[row][j] == 0) {
                    colFlag = 1;
                    break;
                }
                matrix[i][j] = 5;
            }
        }

        int endRow = rowFlag == 1 ? i - 1 : i;
        int enCol = colFlag != 0 ? j - 1 : j;
        if (row < endRow && col < enCol) return Boolean.TRUE;
        return Boolean.FALSE;
    }
}
