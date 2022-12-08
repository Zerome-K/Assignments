package zohoSets.set5;

import java.util.Scanner;

public class TrainTimings {

    public static void main(String[] args) {
        TrainTimings tt = new TrainTimings();
        tt.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER SIZE : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int[] dep = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("ENTER ARR TIME : ");
            int arrTime = scanner.nextInt();
            System.out.print("ENTER DEP TIME : ");
            int depTime = scanner.nextInt();
            arr[i] = arrTime;
            dep[i] = depTime;
        }
        System.out.println("TOTAL PLATFORM : " + countPlatform(arr, dep));
    }

    private int countPlatform(int[] arr, int[] dep) {

        int platform = 1;

        for (int i = 1; i < arr.length; i++) {
            int arrTime = arr[i];
            int count = platform;
            for (int j = i - 1; j >= 0; j--) {
                if (dep[j] > arrTime) count--;
                else if (count <= 0) {
                    platform++;
                    break;
                }
            }
        }
        return platform;
    }
}
