package zohoSets.set34;

import java.util.Scanner;

public class TopThree {

    private static class Counts {
        int num, count;

        Counts(int num, int count) {
            this.num = num;
            this.count = count;
        }
    }

    public static void main(String[] args) {
        TopThree topThree = new TopThree();
        topThree.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER SIZE : ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        int k = 0;
        Counts[] map = new Counts[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            if (mapper(array[i], map, k)) k++;
        }
        mySort(map, k);
        System.out.print("TOP THREE : ");
        for (int i = 0; i < 3; i++) {
            System.out.print(map[i].num + " ");
        }
    }

    private void mySort(Counts[] map, int k) {
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k - 1 - i; j++) {
                if (map[j].count < map[j + 1].count) {
                    Counts temp = map[j];
                    map[j] = map[j + 1];
                    map[j + 1] = temp;
                }
            }
        }
    }

    private boolean mapper(int num, Counts[] map, int k) {
        for (int idx = 0; idx < k; idx++) {
            if (map[idx].num == num) {
                map[idx].count++;
                return Boolean.FALSE;
            }
        }
        map[k] = new Counts(num, 0);
        return Boolean.TRUE;
    }
}
/*
I/P : [3, 4, 2, 3, 16, 3, 15, 16, 15, 15, 16, 2, 3]
O/P : [3, 16, 15]
 */