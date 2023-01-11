package zohoSets.set29;

import java.util.Scanner;

public class NumberPresent {
    public static void main(String[] args) {
        NumberPresent numberPresent = new NumberPresent();
        numberPresent.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER A NUMBER : ");
        int a = scanner.nextInt();
        System.out.print("ENTER B NUMBER : ");
        int b = scanner.nextInt();
        System.out.println(isPresent(a, b));
    }

    private boolean isPresent(int a, int b) {
        int div = 1;
        while (div <= a) div *= 10;

        while (b > 0) {
            if (b % div == a) return Boolean.TRUE;
            b /= 10;
        }
        return Boolean.FALSE;
    }
}
/*
I/P : ENTER A NUMBER : 124
      ENTER B NUMBER : 321245
O/P : TRUE

 */