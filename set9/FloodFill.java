package zohoSets.set9;

import java.util.Arrays;

public class FloodFill {

    public static void main(String[] args) {
        FloodFill ff = new FloodFill();
        ff.init();
    }

    private void init() {

        int[][] screen = {
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 0, 0},
                {1, 0, 0, 1, 1, 0, 1, 1},
                {1, 2, 2, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 2, 2, 0},
                {1, 1, 1, 1, 1, 2, 1, 1},
                {1, 1, 1, 1, 1, 2, 2, 1},
        };

        int olDColour = screen[0][0];
        fill(screen, 1, 1, olDColour, 3);
        for (int[] arr : screen) {
            System.out.println(Arrays.toString(arr));
        }
    }

    private void fill(int[][] screen, int x, int y, int olDColour, int newColour) {

        if (x == screen.length || y == screen[0].length || x < 0 || y < 0 || screen[x][y] != olDColour) return;

        screen[x][y] = newColour;

        if (x < screen.length - 1)
            fill(screen, x + 1, y, olDColour, newColour);
        if (x > 0)
            fill(screen, x - 1, y, olDColour, newColour);
        if (y < screen[0].length)
            fill(screen, x, y + 1, olDColour, newColour);
        if (y > 0)
            fill(screen, x, y - 1, olDColour, newColour);
    }
}
