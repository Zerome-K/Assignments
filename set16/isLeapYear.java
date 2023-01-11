package zohoSets.set16;

import java.util.Scanner;

public class isLeapYear {

    public static void main(String[] args) {
        isLeapYear isLeapYear = new isLeapYear();
        isLeapYear.init();
    }

    private void init() {
        System.out.print("ENTER YEAR : ");
        int year = new Scanner(System.in).nextInt();
        System.out.println(isLeap(year) ? "LEAP YEAR" : "NOT A LEAP YEAR");
    }

    private boolean isLeap(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) return year % 400 == 0;
            return true;
        }
        return Boolean.FALSE;
    }
}
