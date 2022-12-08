package zohoSets.set8;

import java.util.Scanner;

public class ShortestPath {

    int total;
    String path;

    public static void main(String[] args) {
        ShortestPath shortestPath = new ShortestPath();
        shortestPath.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER ROWS : ");
        int rows = scanner.nextInt();
        System.out.print("ENTER COLUMNS : ");
        int cols = scanner.nextInt();
        int[][] array = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                array[i][j] = scanner.nextInt();
        findPath(array, 0, 0, 0, "");
        System.out.println("TOTAL : " + total + " | PATH NUMS : " + path);
    }

    private void findPath(int[][] arr, int row, int col, int sum, String paths) {

        if (row == arr.length - 1 && col == arr[0].length - 1) {
            if (sum > total) {
                total = sum;
                path = paths + arr[row][col];
            }
        }
        sum += arr[row][col];
        if (row < arr.length - 1)
            findPath(arr, row + 1, col, sum, paths + arr[row][col] + "->");

        if (col < arr[0].length - 1)
            findPath(arr, row, col + 1, sum, paths + arr[row][col] + "->");
    }
}
/*
4. For any given matrix find the path from the start to the end which gives the maximum sum.
   Traverse only right or down.
   Example: starting index is 15 (left top) and ending index is 10 (bottom right)

   15 25 30
   45 25 60
   70 75 10

   O/P:15->45->70->75->10 sum is 215
 */