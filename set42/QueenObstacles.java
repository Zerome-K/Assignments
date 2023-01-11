package zohoSets.set42;

import java.util.Scanner;

public class QueenObstacles {
    private final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        QueenObstacles queenObstacles = new QueenObstacles();
        queenObstacles.init();
    }

    private void init() {
        boolean[][] board = new boolean[8][8];
        System.out.print("ENTER QUEEN POSITION : ");
        int[] qPos = getPosition();
        System.out.print("ENTER NUMBER OF OBSTACLES : ");
        int obsCount = scanner.nextInt();
        while (obsCount-- > 0) {
            int[] pos = getPosition();
            board[pos[0]][pos[1]] = true;
        }
        System.out.print("TOTAL MOVES : " + totalMoves(board, qPos));
    }

    private int totalMoves(boolean[][] board, int[] qPos) {

        int[] xcoords = {1, 1, 1, -1, -1, -1, 0, 0};
        int[] yCoords = {0, -1, 1, 0, -1, 1, -1, 1};
        return check(board, qPos[0], qPos[1], xcoords, yCoords);
    }

    private int check(boolean[][] board, int qPo, int qPo1, int[] x, int[] y) {
        int steps = 0;
        for (int i = 0; i < 8; i++) {
            int dirx = qPo + x[i], diry = qPo1 + y[i];
            while (boundary(dirx, diry) && !board[dirx][diry]) {
                steps++;
                dirx += x[i];
                diry += y[i];
            }
        }
        return steps;
    }

    private boolean boundary(int x, int y) {
        return x >= 0 && x < 8 && y >= 0 && y < 8;
    }

    private int[] getPosition() {
        scanner.nextLine();
        String[] res = scanner.nextLine().split("\\s");
        return new int[]{Integer.parseInt(res[0]), Integer.parseInt(res[1])};
    }
}
