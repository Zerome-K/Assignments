package zohoSets.set12;

import java.util.Scanner;

public class BinaryAdding {

    public static void main(String[] args) {
        BinaryAdding binaryAdding = new BinaryAdding();
        binaryAdding.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER A : ");
        int a = scanner.nextInt();
        System.out.print("ENTER B : ");
        int b = scanner.nextInt();
        System.out.print("ENTER BASE : ");
        int base = scanner.nextInt();
        addByBase(a, b, base);
    }

    private void addByBase(int a, int b, int base) {
        String aBase = base(a, base);
        String bBase = base(b, base);
        int answer = doAdd(aBase, bBase, base);
        System.out.println("ANSWER : " + answer);
    }

    private int doAdd(String aBase, String bBase, int base) {
        int length = Math.max(aBase.length(), bBase.length());
        int result = 0, carry = 0, multiplier = 1,temp = 0;
        boolean flag = Boolean.TRUE;
        for (int i = 0; i < length; i++) {
            int num1 = aBase.length() - 1 - i >= 0 ? aBase.charAt(aBase.length() - 1 - i) - '0' : 0;
            int num2 = bBase.length() - 1 - i >= 0 ? bBase.charAt(bBase.length() - 1 - i) - '0' : 0;
            temp = num1 + num2 + carry;
            if (flag) {
                result += temp % base;
                carry = temp / base;
                flag = false;
            } else {
                multiplier *= base;
                result += (temp % base) * multiplier;
                carry = temp / base;
            }
        }
        if(carry > 0){
            multiplier *= base;
            result += (carry % base) *  multiplier;
        }
        return result;
    }

    private String base(int a, int base) {
        String res = "";
        while (a > 0) {
            res = a % base + res;
            a /= base;
        }
        return res;
    }
}
