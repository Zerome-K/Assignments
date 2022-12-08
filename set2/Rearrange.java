package zohoSets.set2;

import java.util.Arrays;
import java.util.Scanner;

public class Rearrange {

    public static void main(String[] args) {
        Rearrange rearrange = new Rearrange();
        rearrange.init();

    }

    private void init() {

        Scanner scanner = new Scanner(System.in);
//        System.out.print("ENTER SIZE : ");
//        int size = scanner.nextInt();
//        int[] array = new int[size];
//        for (int i = 0; i < size; i++)
//            array[i] = scanner.nextInt();
        int[] array = {45, 21, 16, 1, 8, 3};
        reArrange(array);
        System.out.println(Arrays.toString(array));
    }

    private void reArrange(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (i % 2 == 0 && array[i] < array[j])
                    array[i] = array[i] + array[j] - (array[j] = array[i]);
                else if (i % 2 == 1 && array[i] > array[j])
                    array[i] = array[i] + array[j] - (array[j] = array[i]);
            }
        }
    }
}

/*
   I/P : array = {45, 21, 16, 1, 8, 3};
   O/P : [45, 1, 21, 3, 16, 8]
 */
