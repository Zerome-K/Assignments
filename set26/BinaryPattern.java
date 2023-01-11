package zohoSets.set26;

import java.util.Scanner;

public class BinaryPattern {

    public static void main(String[] args) {
        BinaryPattern binaryPattern = new BinaryPattern();
        binaryPattern.init();
    }

    private void init() {
        System.out.print("ENTER NUM : ");
        int num = new Scanner(System.in).nextInt();
        printPattern(num);
    }

    private void printPattern(int num) {
        int bound = (int) Math.pow(2, num);
        for (int i = 0; i <= bound - 1; i++) {
            System.out.println(String.format("%" + num + "s", Integer.toBinaryString(i))
                    .replace(' ','0'));
        }
    }
}
/*
I/P : 3
O/P:
0 0 0
0 0 1
0 1 0
0 1 1
1 0 0
1 0 1
1 1 0
1 1 1
 */