package zohoSets.set23;

import java.util.Scanner;

public class MaxOf3 {

    public static void main(String[] args) {
        MaxOf3 maxOf3 = new MaxOf3();
        maxOf3.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ENTER FIRST NUMBER : ");
        int a = scanner.nextInt();
        System.out.print("ENTER SECOND NUMBER : ");
        int b = scanner.nextInt();
        System.out.print("ENTER THIRD NUMBER : ");
        int c = scanner.nextInt();
        int largest = a > b ? (a > c ? a : c) : (c > b ? c : b);
        System.out.println(largest);
    }
}
