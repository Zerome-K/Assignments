package zohoSets.set24;

import java.util.Scanner;

public class Wave {

    public static void main(String[] args) {
        Wave wave = new Wave();
        wave.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER SIZE : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = scanner.nextInt();
        makeWave(arr);
    }

    private void makeWave(int[] arr) {
        for (int i = 0; i < arr.length - 1; i += 2) arr[i] = arr[i] + arr[i + 1] - (arr[i + 1] = arr[i]);
    }
}

/*
I/P : n = 5 , arr[] = {1,2,3,4,5}
O/P : 2 1 4 3 5
Explanation: Array elements after
sorting it in wave form are 2 1 4 3 5.
 */