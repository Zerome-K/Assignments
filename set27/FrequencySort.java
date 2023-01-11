package zohoSets.set27;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class FrequencySort {

    static class Map {
        int key, val;

        Map(int key, int val) {
            this.key = key;
            this.val = val;
        }

        public int compare(Map other) {
            return other.val - val;
        }

        public int getVal() {
            return val;
        }

        public int getKey() {
            return key;
        }
    }

    public static void main(String[] args) {
        FrequencySort frequencySort = new FrequencySort();
        frequencySort.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER SIZE : ");
        int size = scanner.nextInt();
        int k = 0;
        Map[] maps = new Map[size];
        for (int i = 0; i < size; i++) {
            System.out.print("ENTER NUM : ");
            int num = scanner.nextInt();
            if (!isPresent(num, maps, k)) maps[k++] = new Map(num, 1);
        }
        Map[] newMap = new Map[k];
        System.arraycopy(maps, 0, newMap, 0, k);
        Comparator<Map> comparator = Map::compare;
        Comparator<Map> comp = Comparator.comparing(Map::getKey);
        Arrays.sort(newMap, comparator.thenComparing(comp));
        for (Map m : newMap) {
            int count = m.val;
            while (count-- > 0) System.out.print(m.key + " ");
        }
    }

    private boolean isPresent(int num, Map[] maps, int k) {
        for (int i = 0; i < k; i++) {
            if (maps[i].key == num) {
                maps[i].val++;
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}
/*
I/P  : [ 2 2 3 4 5 12 2 3 3 3 12 ]
O/P : 3 3 3 3 2 2 2 12 12 4 5
Explanation : 3 occurred 4 times, 2 occurred 3 times...

I/P : [ 0 -1 2 1 0 ]
O/P : 0 0 -1 1 2
 */