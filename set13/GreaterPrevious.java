package zohoSets.set13;

import java.util.Scanner;

public class GreaterPrevious {

    public static void main(String[] args) {
        GreaterPrevious greaterPrevious = new GreaterPrevious();
        greaterPrevious.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER SIZE : ");
        int size = scanner.nextInt();
        System.out.print("ENTER ELEMENTS : ");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) array[i] = scanner.nextInt();
        findGreater(array);
    }

    private void findGreater(int[] arr) {
        int max = 0x80000000;
        for (int num : arr) {
            if (num > max) {
                System.out.print(num + ",");
                max = num;
            }
        }
    }
}
