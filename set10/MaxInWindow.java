package zohoSets.set10;

import java.util.Scanner;

public class MaxInWindow {

    public static void main(String[] args) {
        MaxInWindow maxInWindow = new MaxInWindow();
        maxInWindow.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER SIZE : ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) array[i] = scanner.nextInt();
        System.out.print("ENTER WINDOW SIZE : ");
        int windowSize = scanner.nextInt();
        System.out.print("MAX's IN WINDOW SIZE " + windowSize + ": ");
        for (int x : maxInWindow(array, windowSize)) System.out.print(x + " ");
    }

    private int[] maxInWindow(int[] array, int windowSize) {
        int[] result = new int[array.length - windowSize + 1];
        int k = 0, j = 0, i = 0, count = 0, max = 0;
        while (i <= array.length - windowSize) {
            if (count == windowSize) {
                result[k++] = max;
                count = 0;
                max = 0;
                i++;
                j = i;
            } else {
                count++;
                if (max < array[j]) max = array[j];
                j++;
            }
        }
        return result;
    }
}
