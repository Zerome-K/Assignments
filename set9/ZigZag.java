package zohoSets.set9;

import java.util.Scanner;

public class ZigZag {

    public static void main(String[] args) {
        ZigZag zigZag = new ZigZag();
        zigZag.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER ROWS : ");
        int rows = scanner.nextInt();
        System.out.print("ENTER COLUMNS : ");
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        printZigzag(matrix);
    }

    private void printZigzag(int[][] screen) {

        int y = 0, x = 0;

        while (x != screen.length && y != screen[0].length) {

            int bound = Math.min(x, screen[0].length - 1 - y);
            for (int up = 0; up <= bound; up++) {
                System.out.print(screen[x--][y++] + " ");
            }
            x++;
            y--;

            if (y + 1 != screen[0].length) y++;
            else x++;

            bound = Math.min(y, screen.length - 1 - x);

            for (int down = 0; down <= bound; down++) {
                System.out.print(screen[x++][y--] + " ");
            }
            x--;
            y++;

            if (x + 1 != screen.length) x++;
            else y++;
        }
    }
}

/*
Input:

1 2 3
4 5 6
7 8 9

Output : 1 2 4 7 5 3 6 8 9
 */