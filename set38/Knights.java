package zohoSets.set38;

public class Knights {

    public static void main(String[] args) {
        Knights knights = new Knights();
        knights.init();
    }

    private void init() {
        boolean[][] board = new boolean[6][6];
        play(board, 6, 0);
    }

    private void play(boolean[][] board, int count, int row) {
        if (count == 0) {
            display(board);
            return;
        }
        if (row == board.length) return;
        for (int i = 0; i < board[0].length; i++) {
            if ((!board[row][i]) && isValid(board, row, i)) {
                board[row][i] = Boolean.TRUE;
                play(board, count - 1, row + 1);
//                board[row][i] = Boolean.FALSE;
            }
        }
    }

    private void display(boolean[][] board) {
        for (boolean[] arr : board) {
            for (boolean b : arr)
                System.out.print(b ? "K " : '\u0000' + " ");
            System.out.println();
        }
        System.out.println();
    }

    private boolean isValid(boolean[][] board, int row, int i) {

        if (boundaryCheck(board, row - 2, i - 1))
            if (board[row - 2][i - 1]) return false;
        if (boundaryCheck(board, row - 2, i + 1))
            if (board[row - 2][i + 1]) return false;
        if (boundaryCheck(board, row - 1, i + 2))
            if (board[row - 1][i + 2]) return false;
        if (boundaryCheck(board, row - 1, i - 2))
            if (board[row - 1][i - 2]) return false;
        if (boundaryCheck(board, row + 2, i - 1))
            if (board[row + 2][i - 1]) return false;
        if (boundaryCheck(board, row + 2, i + 1))
            if (board[row + 2][i + 1]) return false;
        if (boundaryCheck(board, row + 1, i + 2))
            if (board[row + 1][i + 2]) return false;
        if (boundaryCheck(board, row + 1, i - 2))
            if (board[row + 1][i - 2]) return false;
        return true;
    }

    private boolean boundaryCheck(boolean[][] board, int row, int i) {
        return row >= 0 && row < board.length && i >= 0 && i < board[0].length;
    }
}
