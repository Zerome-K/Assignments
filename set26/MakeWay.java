package zohoSets.set26;

public class MakeWay {

    public static void main(String[] args) {
        MakeWay makeWay = new MakeWay();
        makeWay.init();
    }

    private void init() {
        char[][] matrix = {
                {'1', '1', '0', '0'},
                {'1', '0', '0', '1'},
                {'1', '1', '1', '1'},
                {'0', '0', '0', '1'}
        };
        travel(matrix, 0, 0);

        for (char[] a : matrix) {
            System.out.println(a);
        }
    }

    private Boolean travel(char[][] matrix, int row, int col) {

        if (row == matrix.length - 1 && col == matrix[0].length - 1) {
            matrix[row][col] = '_';
            return Boolean.TRUE;
        }

        if (row == matrix.length || row < 0 || col == matrix[0].length || col < 0 || matrix[row][col] == '0')
            return Boolean.FALSE;

        matrix[row][col] = '_';

        if (!travel(matrix, row + 1, col) && !travel(matrix, row, col + 1))
            matrix[row][col] = '1';

        return Boolean.TRUE;
    }
}

/*
  I/P :
   N=4
   1 1 0 0
   1 0 0 1
   1 1 1 1
   0 0 0 1
   O/P:
   _ 1 0 0
   _ 0 0 1
   _ _ _ _
   0 0 0 _
 */