package zohoSets.set1;

import java.util.Scanner;
import java.util.TreeMap;

public class Weights {

    public static void main(String[] args) {
        Weights w = new Weights();
        w.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER SIZE : ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("ENTER NUM : ");
            array[i] = scanner.nextInt();
        }
        weights(array);
    }

    public static void weights(int[] nums) {

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int num : nums) {
            int weight = 0;
            if (num % 2 == 0) weight += 3;
            if (num % 4 == 0 || num % 6 == 0) weight += 4;
            if (Math.sqrt(num) == (int) Math.sqrt(num)) weight += 5;
            map.put(num, weight);
        }
        System.out.println(map);
    }
}
