package zohoSets.set14;

import java.util.Scanner;

public class NPRandNCR {

    public static void main(String[] args) {
        NPRandNCR npRandNCR = new NPRandNCR();
        npRandNCR.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER STRING : ");
        String str = scanner.next();
        System.out.print("PERMUTATIONS : ");
//        permutation(str, "");
        System.out.println();
        System.out.print("COMBINATION : ");
        combination(str, "", 0);
    }

    private void permutation(String str, String processed) {
        if (str.length() == 0) {
            System.out.print(processed + " ");
            return;
        }
        char ch = str.charAt(0);
        for (int i = 0; i <= processed.length(); i++) {
            String f = processed.substring(0, i);
            String b = processed.substring(i);
            permutation(str.substring(1), f + ch + b);
        }
    }

    private void combination(String str, String res, int start) {
        for (int i = start; i < str.length(); i++) {
            res += str.charAt(i);
            System.out.print(res + " ");
            if (i < str.length() - 1) combination(str, res, i + 1);
            res = res.substring(0, res.length() - 1);
        }
    }
}
