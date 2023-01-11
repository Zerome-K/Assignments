package zohoSets.set24;

import java.util.Scanner;

public class Base7 {

    public static void main(String[] args) {
        Base7 base7 = new Base7();
        base7.init();
    }

    private void init() {
        System.out.print("ENTER NUMBER : ");
        int num = new Scanner(System.in).nextInt();
        System.out.println("BASE SEVEN : " + baseSeven(num));
    }

    private String baseSeven(int num) {
        String res = "";
        while (num > 0) {
            int rem = num % 7;
            res = rem + res;
            num /= 7;
        }
        return res;
    }
}
/*
I/P : 54
O/P : 105
 */