package zohoSets.set18;

import java.util.Scanner;

public class CheckValue {

    public static void main(String[] args) {
        CheckValue checkValue = new CheckValue();
        checkValue.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER ARRAY SIZE : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = scanner.nextInt();
        System.out.print("ENTER VALUE : ");
        int val = scanner.nextInt();
        System.out.println(check(arr, val));
    }

    private boolean check(int[] arr, int val) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            if (arr[start] + arr[end] > val) end--;
            else if (arr[start] + arr[end] < val) start++;
            else {
                System.out.println(start + "-" + end);
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}
/*
I/P : Array = {1 3 4 8 10 } | N = 7
O/P : TRUE
 */