package zohoSets.set33;

import java.util.Arrays;

public class RectangleSum {

    public static void main(String[] args) {
        RectangleSum rs = new RectangleSum();
        rs.init();
    }

    private void init() {
        int[][] matrix = {{1, 2, 3, 4, 6}, {5, 3, 8, 1, 2}, {4, 6, 7, 5, 5}, {2, 4, 8, 9, 4}};
        int[] points = {2, 0, 3, 4};
        if (validatePoint(points))
            System.out.print("*- NO RECTANGLE FORMED -*");
        else {
            System.out.print("TOTAL SUM : " + addRec(matrix, points[0], points[1], points[2], points[3]));
        }
    }

    private boolean validatePoint(int[] points) {

        if (Arrays.stream(points).anyMatch(n -> n < 0 || n > points.length))
            return false;
        if (points[0] == points[2] || points[1] == points[3]) return false;
        if (points[0] > points[2])
            points[2] = points[2] + points[0] - (points[0] = points[2]);
        if (points[1] > points[3])
            points[1] = points[1] + points[3] - (points[3] = points[1]);
        return true;
    }

    private int addRec(int[][] matrix, int x, int y, int x1, int y1) {
        int sum = 0;
        for (int i = x; i <= x1; i++) {
            for (int j = y; j <= y1; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }
}
