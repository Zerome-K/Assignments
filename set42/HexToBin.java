package zohoSets.set42;

import java.util.Scanner;

public class HexToBin {

    private static final String[] binaries = {"", "0001", "0010", "0011", "0100", "0101", "0110",
            "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};

    public static void main(String[] args) {
        HexToBin hb = new HexToBin();
        hb.init();
    }

    private void init() {
        System.out.print("ENTER HEX VALUE : ");
        String hex = new Scanner(System.in).next();
        System.out.print("BINARY : " + convert(hex));
    }

    private String convert(String hex) {
        String res = "";
        for (int i = 0; i < hex.length(); i++) {
            char ch = hex.charAt(i);
            if ('0' <= ch && ch <= '9')
                res += binaries[ch - '0'];
            else res += binaries[ch - 'A' + 10];
        }
        return res;
    }
}
/*
I/P : HEX VALUE - 1F9D
O/P : BINARY    - 0001111110011101
 */