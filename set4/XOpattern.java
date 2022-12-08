package zohoSets.set4;

import java.util.Scanner;

public class XOpattern {

    public static void main(String[] args) {
        XOpattern xOpattern = new XOpattern();
        xOpattern.init();
    }

    private void init() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER ROWS : ");
        int rows = scanner.nextInt();
        System.out.print("ENTER COLUMNS : ");
        int col = scanner.nextInt();
        char[][] arr = new char[rows][col];
        make(arr);
        for (char[] chars : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(chars[j]);
            }
            System.out.println();
        }
    }

    private void make(char[][] arr) {

        int top = 0, right = arr[0].length - 1, left = 0, bottom = arr.length - 1;
        int dir = 1;
        char x = 'X';
        while (top <= bottom && left <= right) {
            if (dir == 1) {
                for (int i = left; i <= right; i++) arr[top][i] = x;
                top++;
                dir = 2;
            } else if (dir == 2) {
                for (int i = top; i <= bottom; i++) arr[i][right] = x;
                right--;
                dir = 3;
            } else if (dir == 3) {
                for (int i = right; i >= left; i--) arr[bottom][i] = x;
                bottom--;
                dir = 4;
            } else {
                for (int i = bottom; i >= top; i--) arr[i][left] = x;
                left++;
                dir = 1;
                x = x == 'X' ? 'O' : 'X';
            }
        }
    }
}
