package zohoSets.set4;

import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {
        Addition addition = new Addition();
        addition.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER ARR 1 SIZE : ");
        String[] dimension = scanner.nextLine().trim().split("\\s");
        int[] set1 = new int[Integer.parseInt(dimension[0])];
        int[] set2 = new int[Integer.parseInt(dimension[1])];
        System.out.print("ENTER ARR 1 VALUES : ");
        for (int i = 0; i < set1.length; i++) set1[i] = scanner.nextInt();
        System.out.print("ENTER ARR 2 VALUES : ");
        for (int i = 0; i < set2.length; i++) set2[i] = scanner.nextInt();
        add(set1, set2);
    }

    private void add(int[] set1, int[] set2) {
        int carry = 0, i = set1.length - 1, j = set2.length - 1, add;
        String result = "";
        while (i >= 0 && j >= 0) {
            add = set1[i] + set2[j] + carry;
            result = add % 10 + result;
            carry = add / 10;
            i--;
            j--;
        }
        while (i >= 0) {
            add = set1[i] + carry;
            result = add % 10 + result;
            carry = add / 10;
            i--;
        }
        while (j >= 0) {
            add = set2[j] + carry;
            result = add % 10 + result;
            carry = add / 10;
            j--;
        }
        if (carry > 0) result = carry + result;
        System.out.println("ANSWER : " + result);
    }
}

/*
#1
Number of elements in set1  : 4
Elements are                : 9, 9, 9, 9
Number of elements in set 2 : 3
Elements are                : 1,1,1
Output                      : 1, 0, 1, 1, 0
#2
Number of elements in set1  : 11
Elements are                : 7,2,3,4,5,3,1,2,7,2,8
Number of elements in set 2 : 3
Elements are                : 1,2,3
Output                      : 7,2,3,4,5,3,1,2,8,5,1
 */
