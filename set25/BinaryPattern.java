package zohoSets.set25;

import java.util.Scanner;

public class BinaryPattern {
    public static void main(String[] args) {
        BinaryPattern binaryPattern = new BinaryPattern();
        binaryPattern.init();
    }

    private void init() {
        System.out.print("ENTER NUM : ");
        int num = new Scanner(System.in).nextInt();
        printPattern(num);
    }

    private void printPattern(int num) {
//        int[] arr = new int[num];
        for (int i = 1; i <= Math.pow(2, num) - 1; i++) {
//            printArray(arr);
            String bin = Integer.toBinaryString(i);
//            make(bin, arr);
            System.out.println(String.format("%" + num  + "s",bin).replaceAll(" ","0"));
        }
//        printArray(arr);
    }

    private void printArray(int[] arr) {
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
    }

    private void make(String bin, int[] arr) {
        for (int i = bin.length() - 1; i >= 0; i--)
            arr[arr.length - 1 - (bin.length() - i - 1)] = bin.charAt(i) - '0';
    }
}
