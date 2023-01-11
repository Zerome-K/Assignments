package zohoSets.set25;

public class Way {

    public static void main(String[] args) {
        Way way = new Way();
        way.init();
    }

    private void init() {
        char[][] matrix = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'0', '0', '0', '1', '0'},
                {'1', '1', '1', '1', '1'}
        };
        makeWay(matrix, 0, 0);

        for (char[] arr : matrix) {
            System.out.println(arr);
        }
    }

    private boolean makeWay(char[][] matrix, int row, int col) {

        if (row == matrix.length - 1 && col == matrix[0].length - 1 && matrix[row][col] == '1') {
            matrix[row][col] = '_';
            return Boolean.TRUE;
        }
        if (row < 0 || row == matrix.length || col < 0 || col == matrix[0].length || matrix[row][col] == '0')
            return Boolean.FALSE;
        else {
            char ch = matrix[row][col];
            matrix[row][col] = '_';
            if (!makeWay(matrix, row + 1, col) && !makeWay(matrix, row, col + 1))
                matrix[row][col] = ch;
        }
        return Boolean.TRUE;
    }
}
