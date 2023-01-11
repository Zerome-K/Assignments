package zohoSets.set34;

import java.util.Scanner;

public class NextPallindrome {

    public static void main(String[] args) {
        NextPallindrome np = new NextPallindrome();
        np.init();
    }

    private void init() {
        System.out.print("ENTER NUMBER : ");
        String num = new Scanner(System.in).next();
        System.out.println("NEXT PALLINDROME : " + nextPallindrome(num));
    }

    private String nextPallindrome(String num) {
        char[] arr = num.toCharArray();
        findNext(arr);
        if (arr[0] == 'X') return "*- NO POSSIBILITIES -*";
        String res = "";
        for (char ch : arr) {
            res += ch;
        }
        return res;
    }

    private void findNext(char[] arr) {
        int peak, idx;
        while (true) {
            peak = arr.length - 2;
            while (peak >= 0 && arr[peak] > arr[peak + 1])
                peak--;
            if (peak == -1) {
                arr[0] = 'X';
                return;
            }
            idx = arr.length - 1;
            while (arr[idx] <= arr[peak]) idx--;
            swap(arr, idx, peak);
            mySort(arr, peak + 1, arr.length);
            if (isPall(arr)) return;
        }
    }

    private boolean isPall(char[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i++] != arr[j--]) return false;
        }
        return true;
    }

    private void mySort(char[] arr, int i, int length) {
        for (int j = i; j < length; j++) {
            for (int k = i; k < length - 1 - (j - i); k++) {
                if (arr[k] > arr[k + 1]) swap(arr, k, k + 1);
            }
        }
    }

    private void swap(char[] arr, int idx, int i) {
        char temp = arr[idx];
        arr[idx] = arr[i];
        arr[i] = temp;
    }
}
/*
I/P : 13212
O/P : 12321
 */