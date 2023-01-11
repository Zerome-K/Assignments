package zohoSets.set39;

import java.util.Scanner;

public class FirstOccurance {
    public static void main(String[] args) {
        FirstOccurance fo = new FirstOccurance();
        fo.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER STRING A : ");
        String str = scanner.nextLine();
        System.out.print("ENTER STRING B : ");
        String str1 = scanner.next();
        System.out.println("RESULT : " + find(str, str1));
    }

    private String find(String str, String str1) {
        int start = str.length(), end = -1;
        for (int i = 0; i < str1.length(); i++) {
            int idx = firstOccur(str, str1.charAt(i));
            if (idx == -1) continue;
            if (idx > end) end = idx;
            if (start > idx) start = idx;
        }
        return str.substring(start, end + 1);
    }

    private int firstOccur(String str, char ch) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) return i;
        }
        return -1;
    }
}
/*
I/P: ZOHOCORPORATION, PORT
O/P: OHOCORPORAT
 */