package zohoSets.set25;

import java.util.Scanner;

public class NumberToRoman {


    public static void main(String[] args) {
        NumberToRoman numberToRoman = new NumberToRoman();
        numberToRoman.init();
    }

    private void init() {
        System.out.print("ENTER NUMBER : ");
        int num = new Scanner(System.in).nextInt();
        System.out.println(num + " -> " + convert(num));
//        String roman = new Scanner(System.in).next();
//        System.out.println(roman + "->" + romanToNumber(roman));
    }

    private String convert(int num) {
        int div = 1;
        while (div <= num) div *= 10;
        div /= 10;
        String res = "";
        while (num > 0) {
            int digit = num / div;
            if (digit == 2 || digit == 3) {
                int temp = digit;
                while (temp-- > 0) res += refer(div);
            } else if (digit == 4) {
                res += refer(div);
                res += refer(div * 5);
            } else if (digit == 5) res += refer(div * 5);
            else if (digit >= 6 && digit <= 8) {
                res += refer(div * 5);
                int temp = digit - 5;
                while (temp-- > 0) res += refer(div);
            } else if (digit == 9) {
                res += refer(div * 10);
                res += refer(div);
            } else {
                res += refer(div);
            }
            num %= div;
            div /= 10;
        }
        return res;
    }

    private int romanToNumber(String roman) {
        int res = 0;

        for (int i = 0; i < roman.length(); i++) {
            char ch = roman.charAt(i);
            if (i + 1 < roman.length() && refer1(roman.charAt(i + 1)) > refer1(roman.charAt(i))) {
                res += refer1(roman.charAt(i + 1));
                res -= refer1(roman.charAt(i));
                i += 2;
            } else res += refer1(ch);
        }
        return res;
    }

    private char refer(int num) {
        switch (num) {
            case 1 -> {
                return 'I';
            }
            case 5 -> {
                return 'V';
            }
            case 10 -> {
                return 'X';
            }
            case 50 -> {
                return 'L';
            }
            case 100 -> {
                return 'C';
            }
            case 500 -> {
                return 'D';
            }
            default -> {
                return 'M';
            }
        }
    }

    private int refer1(char ch) {
        switch (ch) {
            case 'I' -> {
                return 1;
            }
            case 'V' -> {
                return 5;
            }
            case 'X' -> {
                return 10;
            }
            case 'L' -> {
                return 50;
            }
            case 'C' -> {
                return 100;
            }
            case 'D' -> {
                return 500;
            }
            default -> {
                return 1000;
            }
        }
    }
}
