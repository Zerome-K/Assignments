package zohoSets.set18;

import java.util.Arrays;
import java.util.Scanner;

public class AddInArray {

    public static void main(String[] args) {
        AddInArray addInArray = new AddInArray();
        addInArray.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER A SIZE : ");
        int sizeA = scanner.nextInt();
        System.out.print("ENTER B SIZE : ");
        int sizeB = scanner.nextInt();
        int[] a = new int[sizeA];
        int[] b = new int[sizeB];
        System.out.print("ENTER A ELEMENTS : ");
        for (int i = 0; i < sizeA; i++) a[i] = scanner.nextInt();
        System.out.print("ENTER A ELEMENTS : ");
        for (int i = 0; i < sizeB; i++) b[i] = scanner.nextInt();
        System.out.print("RESULT  : ");
        System.out.println(Arrays.toString(add(a, b)));
    }

    private int[] add(int[] a, int[] b) {

        int size = Math.max(a.length, b.length);
        int[] result = new int[size + 1];
        int carry = 0, aIndex = a.length - 1, bIndex = b.length - 1;
        for (int i = size; i >= 0; i--, aIndex--, bIndex--) {
            int sum = 0;
            if (aIndex >= 0 && bIndex >= 0) sum = a[aIndex] + b[bIndex] + carry;
            else if (aIndex >= 0) sum = a[aIndex] + carry;
            else if (bIndex >= 0) sum = b[bIndex] + carry;
            result[i] = sum % 10;
            carry = sum / 10;
        }
        if (carry > 0)
            result[0] = carry;
        return result;
    }
}

/*
Input:
Number of digits: 12 |  9 2 8 1 3 5 6 7 3 1 1 6
Number of digits: 9  |  7 8 4 6 2 1 9 9 7
Output :             |  9 2 8 9 2 0 2 9 5 1 1 3
 */
