package zohoSets.set8;

import java.util.Arrays;
import java.util.Scanner;

public class FactorsSort {

    static class Element {
        int num, count;

        Element(int num, int count) {
            this.num = num;
            this.count = count;
        }
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER SIZE : ");
        int size = scanner.nextInt();
        Element[] arr = new Element[size];
        int x;
        for (int i = 0; i < size; i++) {
            x = scanner.nextInt();
            arr[i] = new Element(x,countFactor(x));
        }
        sortFactor(arr);
        System.out.println(Arrays.toString(arr));
    }

    private void sortFactor(Element[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].count < arr[j].count) min = j;
            }
            Element temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    private int countFactor(int x) {
        int count = 0;
        int sqrt = (int) Math.sqrt(x);
        if (sqrt * sqrt == x) count++;
        for (int i = 1; i < sqrt; i++) if (x % i == 0) count += 2;
        return count;
    }

    public static void main(String[] args) {
        FactorsSort factorsSort = new FactorsSort();
        factorsSort.init();
    }
}


/*
I/P: {6,8,9}
O/P: {8,6,9} or {6,8,9}
Reason: factors of 8 (1,2,4,8), factors of 6 (1,2,3,6), factors of 9 (1,3,9).
 */