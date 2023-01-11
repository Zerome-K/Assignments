package zohoSets.set21;

public class FindInMatrix {

    public static void main(String[] args) {
        FindInMatrix findInMatrix = new FindInMatrix();
        findInMatrix.init();
    }

    private void init() {
        char[][] matrix = {
                {'P', 'W', 'K', 'C', 'T'},
                {'B', 'O', 'F', 'A', 'L'},
                {'O', 'O', 'E', 'R', 'M'},
                {'X', 'L', 'A', 'T', 'E'},
                {'A', 'C', 'O', 'T', 'N'}
        };
        String word = "POET";
        search(matrix, word);
    }

    private void search(char[][] matrix, String word) {

        int[] x = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] y = {-1, 0, 1, -1, 1, -1, 0, 1};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                isPresent(matrix, i, j, word, x, y);
            }
        }
    }

    private void isPresent(char[][] matrix, int row, int col, String word, int[] x, int[] y) {
        if (matrix[row][col] != word.charAt(0))
            return;
        for (int i = 0; i < 8; i++) {
            int r = row + x[i], c = y[i], j;
            for (j = 1; j < word.length(); j++) {
                if (r >= matrix.length || r < 0 || c < 0 || c >= matrix[0].length)
                    break;
                if (matrix[r][c] != word.charAt(j))
                    break;
                r += x[i];
                c += y[i];
            }
            if (j == word.length())
                System.out.println(row + " - " + col);
        }
    }
}