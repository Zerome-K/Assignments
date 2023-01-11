package zohoSets.set23;

import java.util.Scanner;

public class OddorEven {

    public static void main(String[] args) {
        OddorEven oddorEven = new OddorEven();
        oddorEven.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER NUMBER : ");
        int num = scanner.nextInt();
        count(num);
    }

    private void count(int num) {
        int odd = 0, even = 0;
        while (num > 0) {
            int i = ((num % 10) & 1) == 1 ? ++odd : ++even;
            num /= 10;
        }
        System.out.println("ODD : " + odd + " EVEN : " + even);
    }
}
