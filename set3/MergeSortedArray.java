package zohoSets.set3;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
        MergeSortedArray msa = new MergeSortedArray();
        msa.init();
    }

    private void init() {

        int[] arr = {2, 4, 5, 6, 7, 9, 10, 13};
        int[] arr1 = {2, 3, 4, 5, 6, 7, 8, 9, 11, 15};
        merge(arr, arr1);
    }

    private void merge(int[] arr, int[] arr1) {

        int[] newArr = new int[arr1.length + arr.length];

        int i = 0, j = 0, k = 0;

        while (i < arr.length && j < arr1.length) {
            if (arr[i] < arr1[j]) {
                newArr[k] = arr[i];
                i++;
            } else if ((arr[i] > arr1[j])) {
                newArr[k] = arr1[j];
                j++;
            } else {
                newArr[k] = arr[i];
                i++;
                j++;
            }
            k++;
        }

        while (i < arr.length) {
            newArr[k] = arr[i];
            i++;
            k++;
        }
        while (j < arr1.length) {
            newArr[k] = arr1[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(newArr));
    }
}

/*
Input:
       Array 1: 2,4,5,6,7,9,10,13
       Array 2: 2,3,4,5,6,7,8,9,11,15
       Output:
       Merged array: 2,3,4,5,6,7,8,9,10,11,13,15
 */
