package zohoSets.set34;

import java.util.Arrays;
import java.util.Scanner;

public class FindNextGreater {
    public static void main(String[] args) {
        FindNextGreater fng = new FindNextGreater();
        fng.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER SIZE : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = scanner.nextInt();
        findNext(arr);
        System.out.println(Arrays.toString(arr));
    }

    private void findNext(int[] arr) {
        int[] sorted = Arrays.copyOf(arr, arr.length);
        mySort(sorted, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) arr[i] = binSearch(arr[i], sorted);
    }

    private int binSearch(int num, int[] sorted) {
        int start = 0, end = sorted.length - 1, mid = -1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (sorted[mid] == num) break;
            else if (sorted[mid] < num) start = mid + 1;
            else end = mid - 1;
        }
        if (mid == sorted.length - 1) return -1;
        return sorted[mid + 1];
    }

    private void mySort(int[] arr, int s, int e) {
        int pi;
        if (s < e) {
            pi = partition(arr, s, e);
            mySort(arr, 0, pi - 1);
            mySort(arr, pi + 1, e);
        }
    }

    private int partition(int[] arr, int s, int e) {
        int pivot = arr[e], idx = -1;
        for (int i = 0; i < e; i++) {
            if (arr[i] < pivot) {
                idx++;
                arr[idx] = arr[i] + arr[idx] - (arr[i] = arr[idx]);
            }
        }
        arr[idx + 1] = arr[e] + arr[idx + 1] - (arr[e] = arr[idx + 1]);
        return idx + 1;
    }
}
/*
I/P : [6, 3, 9, 10, 8, 2, 1, 15, 7];
O/P : [7, 5, 10, 15, 9, 3, 2, _, 8];
 */