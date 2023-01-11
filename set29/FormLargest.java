package zohoSets.set29;

import java.util.Scanner;

public class FormLargest {

    public static void main(String[] args) {
        FormLargest formLargest = new FormLargest();
        formLargest.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER SIZE : ");
        int size = scanner.nextInt();
        String[] arr = new String[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.next();
        }
        System.out.println("RESULT : " + makeNum(arr));
    }

    private String makeNum(String[] arr) {
        String res = "";
        mySort(arr);
        for (String x : arr) res += x;
        return res;
    }

    private void mySort(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                String XY = arr[j] + arr[j + 1];
                String YX = arr[j + 1] + arr[j];
                if (YX.compareTo(XY) > 0) {
                    String t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }
}
/*
I/P : N = 5, Arr[] = {3, 30, 34, 5, 9};
O/P : 9534330
EXP : Given numbers are {3, 30, 34, 5, 9}, the arrangement 9534330 gives the largest value.
 */