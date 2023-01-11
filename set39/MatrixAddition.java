package zohoSets.set39;

import java.util.Scanner;

public class MatrixAddition {

    private static class MyArray {
        int[] arr;
        int idx;

        MyArray(int size) {
            arr = new int[size];
            idx = 0;
        }

        public void add(int x) {
            this.arr[idx++] = x;
        }

        public int getLast() {
            if (idx == 0) return 0;
            return arr[--idx];
        }
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER 2D SIZE : ");
        int size = scanner.nextInt();
        MyArray[] arr = new MyArray[size];
        int maxSize = 0;
        for (int i = 0; i < size; i++) {
            System.out.print("ENTER ARR SIZE : ");
            int inSize = scanner.nextInt();
            maxSize = Math.max(maxSize, inSize);
            MyArray temp = new MyArray(inSize);
            System.out.print("ENTER ARR ELEMENTS : ");
            for (int j = 0; j < inSize; j++) {
                temp.add(scanner.nextInt());
            }
            arr[i] = temp;
        }
        System.out.print("TOTAL : " + addArr(arr, maxSize));
    }

    private String addArr(MyArray[] arr, int maxSize) {

        String total = "";
        int sum, carry = 0;
        while (maxSize-- > 0) {
            sum = 0;
            for (MyArray x : arr) sum += x.getLast();
            sum += carry;
            carry = sum / 10;
            total = (sum % 10) + total;
        }
        if (carry > 0) total = carry + total;
        return total;
    }

    public static void main(String[] args) {
        MatrixAddition ma = new MatrixAddition();
        ma.init();
    }
}
/*
I/P : SIZE - 4
      ARR SIZES - 3 5 4 2
      A1 [2 4 5]
      A2 [4 5 6 7 8]
      A3 [4 9 2 1]
      A4 [1 2]

O/P :     5 0 8 5 6
 */