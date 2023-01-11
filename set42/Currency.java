package zohoSets.set42;

import java.util.Scanner;

public class Currency {

    private static final int[] currencies = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

    public static void main(String[] args) {
        Currency currency = new Currency();
        currency.init();
    }

    private void init() {
        System.out.print("ENTER AMOUNT : ");
        int amount = new Scanner(System.in).nextInt();
        int[] counts = getCount(amount);
        for (int i = 0; i < counts.length; i++)
            if (counts[i] > 0)
                System.out.println(currencies[i] + ":" + counts[i]);

    }

    private int[] getCount(int amount) {
        int[] counts = new int[10];
        for (int i = 0; i < currencies.length; i++) {
            if (currencies[i] <= amount) {
                counts[i] = amount / currencies[i];
                amount %= currencies[i];
            }
        }
        return counts;
    }
}
/*
I/P :  AMOUNT : 232145

O/P : 2000:116
      100:1
      20:2
      5:1
 */