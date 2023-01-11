package zohoSets.set14;

import java.util.Scanner;

public class RomanToNumeral {

    public static void main(String[] args) {
        RomanToNumeral romanToNumeral = new RomanToNumeral();
        romanToNumeral.init();
    }

    private void init() {
        System.out.print("ENTER ROMAN : ");
        String roman = new Scanner(System.in).next();
        System.out.print("DECIMAL NUMBER : " + convert(roman));
    }

    private int convert(String roman) {
        int total = 0;
        for (int idx = 0; idx < roman.length(); idx++) {
            char ch = roman.charAt(idx);
            if ((idx + 1) < roman.length() && valueOf(ch) < valueOf(roman.charAt(idx + 1))) {
                total += valueOf(roman.charAt(idx + 1)) - valueOf(ch);
                idx += 2;
            } else total += valueOf(ch);
        }
        return total;
    }

    private int valueOf(char ch) {
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
            case 'M' -> {
                return 1000;
            }
            default -> {
                return 0;
            }
        }
    }
}

/*
I/P : MMDCLIX
O/P : 2659
 */