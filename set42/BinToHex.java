package zohoSets.set42;

import java.util.Scanner;

public class BinToHex {


    public static void main(String[] args) {
        BinToHex binToHex = new BinToHex();
        binToHex.init();
    }

    private void init() {
        System.out.print("ENTER STRING : ");
        String bin = new Scanner(System.in).next();
        System.out.println("HEX : " + convert(bin));
    }

    private String toHex(String str) {
        String res;
        switch (str) {
            case "0001" -> res = "1";
            case "0010" -> res = "2";
            case "0011" -> res = "3";
            case "0100" -> res = "4";
            case "0101" -> res = "5";
            case "0110" -> res = "6";
            case "0111" -> res = "7";
            case "1000" -> res = "8";
            case "1001" -> res = "9";
            case "1010" -> res = "A";
            case "1011" -> res = "B";
            case "1100" -> res = "C";
            case "1101" -> res = "D";
            case "1110" -> res = "E";
            case "1111" -> res = "F";
            default -> res = "0";
        }
        return res;
    }

    private String convert(String bin) {

        int length = bin.length();
        int idx = bin.indexOf('.');
        int left = idx != -1 ? idx : length;

        for (int i = 0; i < (4 - left % 4) % 4; i++)
            bin = "0" + bin;
        if (idx != -1) {
            int right = length - left - 1;
            for (int i = 0; i < (4 - right % 4) % 4; i++)
                bin += "0";
        }
        int i = 0;
        String result = "";
        while (i < bin.length()) {
            if (bin.charAt(i) == '.') {
                result += ".";
                i++;
                continue;
            }
            result += toHex(bin.substring(i, i + 4));
            i += 4;
        }
        return result;
    }
}
/*
I/P : "1111001010010100001.010110110011011";
O/P :  794A1.5B36
 */