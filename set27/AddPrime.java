package zohoSets.set27;

import java.util.Arrays;

public class AddPrime {

    public static void main(String[] args) {
        AddPrime addPrime = new AddPrime();
        addPrime.init();
    }

    private void init() {
        int[] a = {35, 7};
        int[] b = {11, 5};
        System.out.println(Arrays.toString(findPrime(a, b)));
    }

    private int[] findPrime(int[] a, int[] b) {
        int[] res = new int[a.length];
        boolean zero = false, one = false;
        for (int i = 1; i <= 3; i++) {
            if (!zero && (a[0] + i) % b[0] == 0) {
                res[0] = i;
                zero = true;
            }
            if (!one && (a[1] + i) % b[1] == 0) {
                res[1] = i;
                one = true;
            }
        }
        if (zero && one) return res;

        for (int start = 5; start < 1000; start += 6) {
            if (isFit(zero, a[0], b[0], start)) {
                zero = true;
                res[0] = start;
            } else if (isFit(zero, a[0], b[0], start + 2)) {
                zero = true;
                res[0] = start + 2;
            }
            if (isFit(one, a[1], b[1], start)) {
                one = true;
                res[1] = start;
            } else if (isFit(one, a[1], b[1], start + 2)) {
                one = true;
                res[1] = start + 2;
            }
            if (zero && one) break;
        }
        return res;
    }

    public boolean isFit(boolean flag, int a, int b, int x) {
        return !flag && (a + x) % b == 0;
    }
}
/*
I/P : [ 20, 7 ], [ 11, 5 ];
O/P : [ 1, 3 ];

EXPLANATION :

(20 + ?) % 11
( 7 + ?) % 5
 */