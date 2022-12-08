package zohoSets.set4;

import java.util.Scanner;

public class OneTwoPattern {

    public static void main(String[] args) {
        OneTwoPattern oneTwoPattern = new OneTwoPattern();
        oneTwoPattern.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER NUMBER : ");
        int number = scanner.nextInt();
        printPattern(number);
    }

    private void printPattern(int number) {

        if (number == 1) {
            System.out.println("1");
            return;
        }
        String str = "1";
        for (int i = 1; i <= number; i++) {
            System.out.println(str);
            String temp = str + "$";
            String result = "";
            int count = 1, idx = 1;
            while (idx < temp.length()) {
                if (temp.charAt(idx - 1) != temp.charAt(idx)) {
                    result += count + "" + temp.charAt(idx - 1);
                    count = 1;
                } else count++;
                idx++;
            }
            str = result;
        }
    }
}
