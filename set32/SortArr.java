package zohoSets.set32;

import java.util.Arrays;
import java.util.Scanner;

public class SortArr {
    public static void main(String[] args) {
        SortArr sortArr = new SortArr();
        sortArr.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER SIZE : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = scanner.nextInt();
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private void sort(int[] arr) {
        int oddIndex = 0, index = 0;
        while (index < arr.length) {
            if ((arr[index] & 1) == 1) {
                arr[oddIndex] = arr[index] + arr[oddIndex] - (arr[index] = arr[oddIndex]);
                oddIndex++;
            }
            index++;
        }
        for (int j = 0; j < oddIndex; j++) {
            for (int k = 0; k < oddIndex - 1 - j; k++) {
                if (arr[k] > arr[k + 1])
                    arr[k] = arr[k] + arr[k + 1] - (arr[k + 1] = arr[k]);
            }
        }
        for (int j = oddIndex; j < index; j++) {
            for (int k = oddIndex; k < index - 1 - (j-oddIndex); k++) {
                if (arr[k] < arr[k + 1])
                    arr[k] = arr[k] + arr[k + 1] - (arr[k + 1] = arr[k]);
            }
        }
    }
}
/*
I/P : 5 8 11 6 2 1 7
O/P : 1 5 7 11 8 6 2
 */