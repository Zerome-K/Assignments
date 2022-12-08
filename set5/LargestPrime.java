package zohoSets.set5;

import java.util.Scanner;

public class LargestPrime {

    public static void main(String[] args) {
        LargestPrime lp = new LargestPrime();
        lp.init();
    }

    private void init() {
        System.out.print("ENTER STRING : ");
        String num = new Scanner(System.in).next();
        String[] max = {num};
        permute(num, "", max);

        System.out.println(max[0] == num ? "NOT POSSIBLE" : max[0]);
    }

    private void permute(String n, String res, String[] max) {
        if (n.length() == 0) {
            if (Integer.parseInt(res) > Integer.parseInt(max[0]) && isPrime(Integer.parseInt(res)))
                max[0] = res;
            return;
        }
        char ch = n.charAt(0);
        for (int i = 0; i <= res.length(); i++) {
//            String f = res.substring(0,i);
            String f = sub(0, i, res);
            String b = res.substring(i);
            permute(n.substring(1), f + ch + b, max);
        }
    }

    private boolean isPrime(int n) {

        if (n <= 1) return false;
        if (n <= 3) return true;

        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }

    private String sub(int start, int end, String str) {
        String res = "";
        for (int i = start; i < end; i++) {
            res += str.charAt(i);
        }
        return res;
    }
}

/*
4691
Output: 9461
 */