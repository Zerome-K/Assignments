package zohoSets.set22;

import java.util.Scanner;

public class MinimumSquare {
    public static void main(String[] args) {
        MinimumSquare minimumSquare = new MinimumSquare();
        minimumSquare.init();
    }

    private void init() {
        System.out.print("ENTER NUMBER : ");
        int num = new Scanner(System.in).nextInt();
        System.out.println("COUNT : " + find(num));
    }

    private int find(int num) {
        int count = 0;
        while (num > 0) {
            int square = findSquare(num);
            System.out.print(square + " ");
            num -= square * square;
            count++;
        }
        return count;
    }

    private int findSquare(int num) {
        if (num == 1) return 1;
        int start = 1, end = num / 2, ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid == num)
                return mid;
            else if (mid * mid > num) end = mid - 1;
            else {
                start = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }
}

/*

Input: 12 Output: min: 3

EXPLANATION :
12 = 1^2 + 1^2 + 1^2 + 1^2 + 1^2 + 1^2 + 1^2 + 1^2 + 1^2 + 1^2 + 1^2 + 1^2
12 = 2^2 + 2^2 + 2^2
12 = 3^2 + 1^2 + 1^2
 */
