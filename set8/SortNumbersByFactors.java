package zohoSets.set8;

import java.util.Arrays;
import java.util.Scanner;

public class SortNumbersByFactors {

    public static void main(String[] args) {
        SortNumbersByFactors sf = new SortNumbersByFactors();
        sf.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER SIZE : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.print("ENTER NUMBERS : ");
        for (int i = 0; i < size; i++) arr[i] = scanner.nextInt();
        sortByFactor(arr);
        System.out.println(Arrays.toString(arr));
    }

    private void sortByFactor(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int idx = i;
            for (int j = i; j < arr.length; j++)
                if(factorCount(arr[i]) < factorCount(arr[j]))idx = j;
            arr[i] = arr[i] + arr[idx] - (arr[idx] = arr[i]);
        }
    }

    private int factorCount(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) if(num % i == 0)count++;
        return count;
    }
}
/*
I/P: {6,8,9}
O/P: {8,6,9} or {6,8,9}
Reason: factors of 8 (1,2,4,8), factors of 6 (1,2,3,6), factors of 9 (1,3,9).
 */