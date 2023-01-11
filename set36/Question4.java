package zohoSets.set36;

import java.util.Arrays;
import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {
        Question4 question4 = new Question4();
        question4.init();
    }

    private void init() {
        System.out.print("ENTER SIZE : ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        make(arr);
        System.out.println(Arrays.toString(arr));
    }

    private void make(int[] arr) {
        int start = 0, end = arr.length - 1, idx = 0, zeroCount = 0;
        while (start < end) {
            if (arr[start] == 0) {
                zeroCount++;
                start++;
            } else if (arr[start] == arr[start + 1]) {
                arr[idx++] = arr[start] * 2;
                arr[start + 1] = 0;
                start++;
            } else arr[idx++] = arr[start++];
        }
        if (arr[end] != 0) arr[idx] = arr[end];
        else zeroCount++;
        for (int i = arr.length - zeroCount; i < arr.length; i++) arr[i] = 0;
    }
}

/*

GFG : https://practice.geeksforgeeks.org/problems/ease-the-array/0

4.  Given an array as input, The condition is if the number is repeated
    you must add the number and put the next index value to 0.
    If the number is 0 print it at the last.

I/P : [0, 2, 2, 2, 0, 6, 6, 0, 8]
O/P : 4 2 12 8 0 0 0 0 0 .
 */


