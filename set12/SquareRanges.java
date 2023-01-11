package zohoSets.set12;

import java.util.Scanner;

public class SquareRanges {

    public static void main(String[] args) {
        SquareRanges squareRanges = new SquareRanges();
        squareRanges.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER NUMBER A : ");
        int a = scanner.nextInt();
        System.out.print("ENTER NUMBER B : ");
        int b = scanner.nextInt();
        sqrtRange(a, b);
    }

    private void sqrtRange(int a, int b) {
        System.out.print("SQUARE NUMBERS : ");
        for (int i = sqrt(a); i * i  <= b ; i++) System.out.print(i * i + ",");
    }

    private int sqrt(int a) {
        int i;
        for (i = 1; i * i <= a; i++){}
        if ((i - 1) * (i - 1) == a) return i - 1;
        return i;
    }
}
