package zohoSets.set1;

import java.util.Scanner;

public class SustringSearch {

    public static void main(String[] args) {
        SustringSearch ss = new SustringSearch();
        ss.init();
    }

    private void init() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER STRING : ");
        String string = scanner.next();
        System.out.print("ENTER PATTERN : ");
        String pattern = scanner.next();
        searchSubString(string, pattern);
    }

    public static void searchSubString(String string, String pattern) {

        int size = string.length() / 5, idx = -1;

        if (size > 0) size += 1;

        char[][] arr = new char[size][5];

        for (int i = 0; i < string.length(); i++) {
            if (i % 5 == 0)
                idx++;
            arr[idx][i % 5] = string.charAt(i);
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                if (arr[row][col] == pattern.charAt(0)) {
                    checkVertices(arr, row, col, pattern);
                }
            }
        }

    }

    private static void checkVertices(char[][] arr, int row, int col, String pattern) {

        if ((arr[0].length - col) >= pattern.length()) {
            int i;
            for (i = 0; i < pattern.length(); i++) {
                if (pattern.charAt(i) != arr[row][col + i]) break;
            }
            if (i == pattern.length())
                System.out.println("HORIZONTAL :: STARTING INDEX : " + row + " " + col +
                        "\nENDING INDEX : " + row + " " + (col + pattern.length() - 1));

        }
        if ((arr.length - row) >= pattern.length()) {
            int i;
            for (i = 0; i < pattern.length(); i++) {
                if (pattern.charAt(i) != arr[row + i][col]) break;
            }
            if (i == pattern.length())
                System.out.println(" VERTICAL :: STARTING INDEX : " + row + " " + col +
                        "\nENDING INDEX : " + (row + i - 1) + " " + col);
        }
    }

}
