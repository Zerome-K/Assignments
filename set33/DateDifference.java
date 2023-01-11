package zohoSets.set33;

public class DateDifference {

    public static void main(String[] args) {
        DateDifference dateDifference = new DateDifference();
        dateDifference.init();
    }

    private void init() {
        int[] d1 = {10, 2, 2000};
        int[] d2 = {10, 3, 2000};
        System.out.println("TOTAL DAYS : " + difference(d1, d2));
    }

    private int difference(int[] d1, int[] d2) {
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int n1 = 0, n2 = 0;
        for (int i = 0; i < d1[1] - 1; i++) n1 += months[i];
        n1 += d1[0];
        n1 += leapCount(d1);
        n1 += 365 * d1[2];
        for (int i = 0; i < d2[1] - 1; i++) n2 += months[i];
        n2 += d2[0];
        n2 += leapCount(d2);
        n2 += 365 * d2[2];
        return n2 - n1;
    }

    private int leapCount(int[] d1) {
        int y = d1[2];
        if (d1[1] <= 2)
            y--;
        return y / 4 - y / 100 + y / 400;
    }
}
/*
Input: dt1 = {10, 2, 2014} dt2 = {10, 3, 2015}
Output: 393 - dt1 represents “10-Feb-2014” and dt2 represents “10-Mar-2015” The difference is 365 + 28

Input: dt1 = {10, 2, 2000} dt2 = {10, 3, 2000}
Output: 29 - Note that 2000 is a leap year

Input: dt1 = {10, 2, 2000} dt2 = {10, 2, 2000}
Output: 0 - Both dates are same

Input: dt1 = {1, 2, 2000}; dt2 = {1, 2, 2004};
Output: 1461 - Number of days is 365*4 + 1
 */