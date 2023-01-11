package zohoSets.set12;

public class SearchMatrix {

    public static void main(String[] args) {
        SearchMatrix searchMatrix = new SearchMatrix();
        searchMatrix.init();
    }

    private void init() {
        int[][] big = {
                {4, 5, 9},
                {1, 3, 5},
                {8, 2, 4}
        };
        int[][] small = {
                {8, 2},
                {4, 5}
        };
        System.out.println(searchMatrix(big, small) ? "MATRIX FOUND" : "MATRIX NOT-FOUND");
    }

    private boolean searchMatrix(int[][] big, int[][] small) {

        for (int i = 0; i < big.length; i++) {
            for (int j = 0; j < big[0].length; j++) {
                if (big[i][j] == small[0][0])
                    if (traverse(big, i, j, small)) return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    private boolean traverse(int[][] big, int row, int col, int[][] small) {
        int colLength = small[0].length, rowLength = small.length;

        if (col + colLength > big[0].length || row + rowLength > big.length)
            return Boolean.FALSE;

        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                if (big[row + i][col + j] != small[i][j]) return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }
}

/*
I/P :
int[][] big = {{4, 5, 9},
                {1, 3, 5},
                {8, 2, 4}};
int[][] small = {{8, 2},
                {4, 5}};

O/P : TRUE
 */