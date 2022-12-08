package zohoSets.set8;

import java.util.Scanner;

public class IsBinaryPallindrome {

    public static void main(String[] args) {
        IsBinaryPallindrome is = new IsBinaryPallindrome();
        is.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER NUMBER : ");
        int number = scanner.nextInt();
        System.out.print(isPallindrome(number) ?
                "GIVEN NUMBER IS PALLINDROME" :
                "GIVEN NUMBER IS NOT A PALLINDROME");
    }

    private boolean isPallindrome(int number) {
        int left = leftSet(number);
        int right = 1;
        while (left > right) {
            if (isBitSet(number, left) != isBitSet(number, right)) return Boolean.FALSE;
            left--;
            right++;
        }
        return Boolean.TRUE;
    }

    private int isBitSet(int number, int shift) {
        return ((number & (number << shift - 1)) != 0) ? 1 : 0;
    }

    private int leftSet(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number >>= 1;
        }
        return count;
    }
}
