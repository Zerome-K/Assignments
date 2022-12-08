package zohoSets.set3;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Question1 q1 = new Question1();
        q1.init();
    }
    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER STRING : ");
        String str = scanner.next();
        output(str);
    }
    private void output(String str) {
        String result = "";
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            int num = 0;
            if ('1' <= str.charAt(i) && str.charAt(i) <= '9') {
                num += str.charAt(i) - '0';
                if (i + 1 < str.length() && '1' <= str.charAt(i + 1) && str.charAt(i + 1) <= '9') {
                    num = num * 10 + str.charAt(i + 1) - '0';
                    flag = false;
                }
                while (num-- > 0) {
                    result += str.charAt(i - 1);
                }
                if (!flag) i += 2;
            }
        }
        System.out.println(result);
    }
}

/*
Eg 1: Input: a1b10
      Output: abbbbbbbbbb

Eg: 2: Input: b3c6d15
       Output: bbbccccccddddddddddddddd

The number varies from 1 to 99.
 */