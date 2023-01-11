package zohoSets.set34;

import java.util.Arrays;
import java.util.Scanner;

public class DistinctPermutations {

    public static void main(String[] args) {
        DistinctPermutations dp = new DistinctPermutations();
        dp.init();
    }

    private void init() {
        System.out.print("ENTER STRING : ");
        String str = new Scanner(System.in).next();
        char[] arr = str.toCharArray();
        printPermu(arr, arr.length);
    }

    private void printPermu(char[] arr, int n) {
        Arrays.sort(arr);
        boolean isFinished = false;
        while (!isFinished) {
            System.out.println(new String(arr));
            int i = n - 2;
            while (i >= 0 && arr[i] >= arr[i + 1]) i--;

            if (i == -1) isFinished = true;
            else {
                int idx = findGreater(arr, arr[i], i + 1, n - 1);
                swap(arr, i, idx);
                Arrays.sort(arr, i + 1, n);
            }
        }
    }

    private void swap(char[] arr, int i, int idx) {
        char temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }

    private int findGreater(char[] arr, char first, int l, int h) {

        int idx = h;

        while (idx >= l) {
            if (arr[idx] > first)
                return idx;
            idx--;
        }
        return l;

//        int ceilIndex = l;
//        for (int i = l + 1; i <= h; i++)
//            if (arr[i] > first && arr[i] < arr[ceilIndex])
//                ceilIndex = i;
//        return ceilIndex;
    }
}
/*
Input : ABCA
Output : [AABC AACB ABAC ABCA ACBA
         ACAB BAAC BACA BCAA CABA
         CAAB CBAA]
 */