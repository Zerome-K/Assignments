package zohoSets.set37;

import java.util.Scanner;

public class DiamondPattern {

    public static void main(String[] args) {
        DiamondPattern diamondPattern = new DiamondPattern();
        diamondPattern.init();
    }

    private void init() {
        System.out.print("ENTER NUM : ");
        int num = new Scanner(System.in).nextInt();
        printPattern(num);
    }

    private void printPattern(int num) {
        int k = -1, spaceBound, starBound;
        for (int i = 1; i <= num * 2 - 1; i++) {
            if (i <= num) {
                spaceBound = (i == num) ? 0 : num - i;
                starBound = i + ++k;
                k = (i == num) ? starBound : k;
            } else {
                k -= 2;
                spaceBound = i - num;
                starBound = k;
            }
            for (int j = 0; j < spaceBound; j++) System.out.print("  ");
            for (int j = 0; j < starBound; j++) System.out.print("* ");
            System.out.println();
        }
    }
}

/*
I/P : NUM - 5
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
 */