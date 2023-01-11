package zohoSets.set33;

import java.util.Scanner;

public class RemovePall {

    public static void main(String[] args) {
        RemovePall removePall = new RemovePall();
        removePall.init();
    }

    private void init() {
        String s = new Scanner(System.in).nextLine();
        System.out.print("RESULT :" + remove(s));
    }

    private String remove(String s) {
        String[] arr = s.split("\\s");
        String res = "";
        for (String x : arr) {
            if (x.length() > 1 && isPall(x))
                continue;
            res += x + " ";
        }
        return res;
    }

    private boolean isPall(String x) {
        int s = 0, e = x.length() - 1;
        while (s < e) {
            if (x.charAt(s) != x.charAt(e)) return Boolean.FALSE;
            s++;
            e--;
        }
        return Boolean.TRUE;
    }
}
/*
I/P : He did a good deed
O/P : He good

I/P : Hari speaks malayalam
O/P : Hari speaks
 */