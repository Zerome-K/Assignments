package zohoSets.set26;

import java.util.Scanner;

public class InsertZero {

    public static void main(String[] args) {
        InsertZero insertZero = new InsertZero();
        insertZero.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER SIZE : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = scanner.nextInt();
        System.out.print("ENTER K : ");
        int k = scanner.nextInt();
        addZero(arr, k);
    }

    private void addZero(int[] arr, int k) {
        int count = 0, idx = 0;
        while (idx < arr.length) {
            System.out.print(arr[idx] + " ");
            if (arr[idx] == 1) {
                count++;
                if (count == k) {
                    System.out.print(0 + " ");
                    count = 0;
                }
            } else count = 0;
            idx++;
        }
    }
}
/*
I/P :
Number of bits: 12
Bits: 1 0 1 1 0 1 1 0 1 1 1 1
Consecutive K: 2

O/P :
1 0 1 1 0 0 1 1 0 0 1 1 0 1 1 0
 */