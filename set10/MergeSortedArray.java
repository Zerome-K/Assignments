package zohoSets.set10;

import java.util.Scanner;

public class MergeSortedArray {
    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER ARRAY 1 SIZE : ");
        int arrSize1 = scanner.nextInt();
        System.out.print("ENTER ARRAY 2 SIZE : ");
        int arrSize2 = scanner.nextInt();
        int[] arrA = new int[arrSize1];
        int[] arrB = new int[arrSize2];
        System.out.print("ENTER ARRAY A ELEMENTS : ");
        for (int i = 0; i < arrSize1; i++) arrA[i] = scanner.nextInt();
        System.out.print("ENTER ARRAY B ELEMENTS : ");
        for (int i = 0; i < arrSize2; i++) arrB[i] = scanner.nextInt();
        mergeArray(arrA, arrB);
    }

    private void mergeArray(int[] a, int[] b) {
        int[] merged = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) merged[k++] = a[i++];
            else if (a[i] == b[j]) {
                merged[k++] = a[i];
                i++;
                j++;
            } else merged[k++] = b[j++];
        }

        while (i < a.length) merged[k++] = a[i++];
        while (j < b.length) merged[k++] = b[j++];

        System.out.print("MERGED ARRAY - ");
        for (int l = 0; l < k; l++) {
            System.out.print(merged[l] + " ");
        }
    }
}
