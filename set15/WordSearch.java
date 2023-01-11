package zohoSets.set15;

public class WordSearch {
    public static void main(String[] args) {
        WordSearch wordSearch = new WordSearch();
        wordSearch.init();
    }

    private void init() {

        char[][] matrix = {
                {'a', 'z', 'o', 'l'},
                {'n', 'x', 'h', 'o'},
                {'v', 'y', 'i', 'v'},
                {'o', 'r', 's', 'e'}
        };

        String[] dictionary = {"van", "zoho", "love", "are", "is" };
        search(matrix, dictionary);
    }

    private void search(char[][] matrix, String[] dictionary) {
        for (String word : dictionary) {
            searcher:
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (matrix[i][j] == word.charAt(0) &&
                            isPresent(matrix, i, j, 0, word)) {
                        System.out.println(word);
                        break searcher;
                    }
                }
            }
        }
    }

    private boolean isPresent(char[][] matrix, int row, int col, int index, String word) {

        if (index == word.length()-1 && matrix[row][col] == word.charAt(index) )
            return Boolean.TRUE;

        if (matrix[row][col] != word.charAt(index)) return Boolean.FALSE;

        if (row < matrix.length - 1)
            if (isPresent(matrix, row + 1, col, index + 1, word)) return Boolean.TRUE;

        if (col < matrix[0].length - 1)
            if (isPresent(matrix, row, col + 1, index + 1, word)) return Boolean.TRUE;

        return Boolean.FALSE;
    }
}
