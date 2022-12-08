package zohoSets.set9;

import java.util.Arrays;

public class ReplaceElements {

    public static void main(String[] args) {
        ReplaceElements replaceElements = new ReplaceElements();
        replaceElements.init();
    }

    private void init() {
        int[] arr = {16, 17, 4, 3, 5, 2, 7, 56, 42, 8, 15};
        nextGreatest(arr);
        System.out.println(Arrays.toString(arr));
    }

    private void replace(int[] arr) {
        for (int i = 0; i <= arr.length - 2; i++) {
            int max = arr[i + 1];
            for (int j = i + 1; j < arr.length; j++) if (arr[j] > max) max = arr[j];
            arr[i] = max;
        }
        arr[arr.length - 1] = -1;
    }

    private void nextGreatest(int[] arr) {

        int size = arr.length, max = arr[size - 1];
        arr[size - 1] = -1;
        for (int idx = size - 2; idx > -1; idx--) {
            int temp = arr[idx];
            arr[idx] = max;
            if (temp > max) max = temp;
        }
    }
}
