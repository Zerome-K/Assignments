package zohoSets.set32;

import java.util.Scanner;

public class Equilibrium {

    public static void main(String[] args) {
        Equilibrium equilibrium = new Equilibrium();
        equilibrium.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER SIZE : ");
        int size = scanner.nextInt();
        int sum = 0;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        System.out.println("BARY CENTER INDEX : " + findEqual(arr, sum));
    }

    private int findEqual(int[] arr, int sum) {
        int left = 0;
        for (int i = 0; i < arr.length; i++) {
            sum -= arr[i];
            if (left == sum) return i;
            left += arr[i];
        }
        return -1;
    }
}
/*
I/P :  [1, 2, 3, 7, 6]
O/P :  7 (has 1+ 2+3 in left 6 in right)
 */