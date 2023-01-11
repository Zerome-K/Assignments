package zohoSets.set29;

import java.util.Scanner;

public class AddDigit {

    public static void main(String[] args) {
        AddDigit addDigit = new AddDigit();
        addDigit.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER DIGIT : ");
        int digit = scanner.nextInt();
        System.out.print("ENTER NUMBER : ");
        int num = scanner.nextInt();
        System.out.println("RESULT : " + doAdd(num, digit));
    }

    private String doAdd(int num, int digit) {
        String res = "";
        while (num > 0) {
            res = (num % 10 + digit) + res;
            num /= 10;
        }
        return res;
    }
}
/*
I/P : digit=4, number = 2875;
O/P : 612119
 */