package zohoSets.set22;

public class MatrixSearch {

    public static void main(String[] args) {
        MatrixSearch matrixSearch = new MatrixSearch();
        matrixSearch.init();
    }

    private void init() {
        char[][] grid = {{'a', 'b', 'c'}, {'d', 'r', 'f'}, {'g', 'h', 'i'}};
        String word = "abc";
        find(grid, word);
    }

    private void find(char[][] grid, String word) {

        int[] x = {0, 0, -1, -1, -1, 1, 1, 1};
        int[] y = {1, -1, 0, -1, 1, 0, -1, 1};

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                search(grid, i, j, x, y, word);
            }
        }
    }

    private void search(char[][] grid, int row, int col, int[] x, int[] y, String word) {

        if (grid[row][col] != word.charAt(0))
            return;

        for (int i = 0; i < 8; i++) {
            int j, r = row + x[i], c = col + y[i];
            for (j = 1; j < word.length(); j++) {
                if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length)
                    break;
                if (grid[r][c] != word.charAt(j))
                    break;

                r += x[i];
                c += y[i];
            }
            if (j == word.length())
                System.out.println(row + "-" + col);
        }
    }
}
