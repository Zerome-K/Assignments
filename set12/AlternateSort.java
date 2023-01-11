package zohoSets.set12;

import java.util.Arrays;
import java.util.Scanner;

public class AlternateSort {

    public static void main(String[] args) {
        AlternateSort alternateSort = new AlternateSort();
        alternateSort.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER SIZE : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = scanner.nextInt();
        sort(arr);
        System.out.println("RESULT ARRAY : " + Arrays.toString(arr));
    }

    private void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if ((i & 1) == 0 && arr[j] > arr[min]) min = j;
                else if ((i & 1) != 0 && arr[j] < arr[min]) min = j;
            }
            arr[i] = arr[min] + arr[i] - (arr[min] = arr[i]);
        }
    }
}
