package zohoSets.set9;

import java.util.Scanner;

public class EquilibriumIndex {

    public static void main(String[] args) {
        EquilibriumIndex equilibriumIndex = new EquilibriumIndex();
        equilibriumIndex.init();
    }

    private void init() {

//        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER SIZE : ");
        int size = scanner.nextInt(), sum = 0;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        System.out.println(getEquilibrium(arr, sum) != -1 ? "INDEX FOUND" : "NOT FOUND");
    }

    private int getEquilibrium(int[] arr, int sum) {

        int left = 0;
        for (int i = 0; i < arr.length; i++) {
            sum -= arr[i];
            if (left == sum) return i;
        }
        return -1;
    }
}

/*
Input: A[] = {-7, 1, 5, 2, -4, 3, 0}
Output: 3
3 is an equilibrium index, because:
A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
 */
