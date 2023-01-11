package zohoSets.set16;

import java.util.Arrays;

public class SortByDigit {

    public static void main(String[] args) {
        SortByDigit sortByDigit = new SortByDigit();
        sortByDigit.init();
    }

    private void init() {
        int[] array = {100, 3,1100, 11, 41, 2, 1};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    private void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i], j = i - 1;
            while (j >= 0 && firstDigit(array[j]) > firstDigit(key)) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    private void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int curr = array[i], idx = i;
            for (int j = i + 1; j < array.length; j++) {
                int f = firstDigit(array[j]), r = firstDigit(curr);
                if (f < r) {
                    curr = array[j];
                    idx = j;
                } else if (f == r) {
                    if (digits(array[j]) < digits(curr)) {
                        curr = array[j];
                        idx = j;
                    }
                }
            }
            array[i] = curr + array[i] - (array[idx] = array[i]);
        }
    }

    private int digits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    private int firstDigit(int n) {
        while (n >= 10) n /= 10;
        return n;
    }
}
/*
EX: I/P - {100, 1, 11, 21, 2, 3}
    O/P - {1, 100, 11, 2, 21, 3}
 */