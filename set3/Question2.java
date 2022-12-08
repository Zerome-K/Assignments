package zohoSets.set3;

import java.util.Arrays;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Question2 q2 = new Question2();
        q2.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER SIZE : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("ENTER NUMBER " + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
        }
        reArrange(arr);
        System.out.println(Arrays.toString(arr));
    }

    private void reArrange(int[] arr) {
        sort(arr, true);
        sort(arr, false);
    }

    private void sort(int[] arr, boolean flag) {
        int start = 0;
        if (!flag) start = 1;
        for (int idx = start; idx < arr.length; idx += 2) {
            for (int i = idx + 2; i < arr.length; i += 2) {
                if (flag && arr[i] > arr[idx])
                    arr[i] = arr[idx] + arr[i] - (arr[idx] = arr[i]);
                if (!flag && arr[i] < arr[idx])
                    arr[i] = arr[idx] + arr[i] - (arr[idx] = arr[i]);
            }
        }
    }
}

/*
Eg 1: Input: 13,2 4,15,12,10,5
      Output: 13,2,12,10,5,15,4
Eg 2: Input: 1,2,3,4,5,6,7,8,9
      Output: 9,2,7,4,5,6,3,8,1
 */
