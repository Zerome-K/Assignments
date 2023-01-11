package zohoSets.set25;

import java.util.Scanner;

public class isFibanaci {
    public static void main(String[] args) {
        isFibanaci isFibanaci = new isFibanaci();
        isFibanaci.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER SIZE : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = scanner.nextInt();
        printFibonacci(arr);
    }

    private void printFibonacci(int[] arr) {
        for (int x : arr)
//            if (isFib(x)) System.out.print(x + " ");
            if (isSquare(5 * x * x + 4) || isSquare(5 * x * x - 4))
                System.out.print(x + " ");
    }

    private boolean isFib(int x) {
        int first = 0, second = 1;
        while (first < x) {
            int temp = first;
            first = second;
            second += temp;
        }
        if (first == x) return Boolean.TRUE;
        return Boolean.FALSE;
    }

    private boolean isSquare(int x) {
        int s = (int) Math.sqrt(x);
        return s * s == x;
    }

    private boolean isSquare1(int x) {
        int i = 2;
        while (i * i < x) i++;
        return i * i == x;
    }
}
/*
I/P : 2 10 4 8
O/P: 2 8
I/P: 1 10 6 8 13 21
O/P: 1 8 13 21
 */