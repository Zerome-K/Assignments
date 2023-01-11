package zohoSets.set23;

import java.util.Scanner;

public class SecondMaximum {

    public static void main(String[] args) {
        SecondMaximum secondMaximum = new SecondMaximum();
        secondMaximum.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER SIZE : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = scanner.nextInt();
        findSecondLargest(arr);
    }

    private void findSecondLargest(int[] arr) {
        int first = 0x80000000, second = 0;
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second) second = num;
        }
        System.out.println("SECOND MAX : " + second);
    }
}
