package zohoSets.set4;

import java.util.Scanner;

public class NumberToWords {

    public static void main(String[] args) {
        NumberToWords nw = new NumberToWords();
        nw.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER NUMBER : ");
        int number = scanner.nextInt();
        numberToWord(number);
    }

    private void numberToWord(int number) {
        String[] ones = {"", " One", " Two", " Three", " Four", " Five",
                " Six", " Seven", " Eight", " Nine", " Ten", " Eleven",
                " Twelve", " Thirteen", " Fourteen", " Fifteen", " Sixteen",
                " Seventeen", " Eighteen", " Nineteen"};
        String[] tens = {"", " Ten", " Twenty", " Thirty", " Forty", " Fifty",
                " Sixty", " Seventy", " Eighty", " Ninety"};
        String result = "";
        if (number == 0) return;
        if (number % 100 < 20) {
            result += ones[number % 100];
            number /= 100;
        } else {
            result += ones[number % 10];
            number /= 10;
            result = tens[number % 10] + result;
            number /= 10;
        }

        if (number == 0) {
            System.out.println(result);
            return;
        }
        System.out.println(ones[number % 10] + " Hundred" + result);

    }
}
