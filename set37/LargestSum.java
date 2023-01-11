package zohoSets.set37;

public class LargestSum {

    public static void main(String[] args) {
        LargestSum largestSum = new LargestSum();
        largestSum.init();
    }

    private void init() {
        int[] arr = {-1, -2, -3, -4};
        System.out.println("MAX SUM : " + maxSubArraySum(arr, arr.length));
    }

    long maxSubArraySum(int[] arr, int n) {
        long grandTotal = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            grandTotal = Math.max(grandTotal, sum);
            if (sum < 0) sum = 0;
        }
        return grandTotal;
    }
}
/*

GFG : https://practice.geeksforgeeks.org/problems/kadanes-algorithm/0

I/P : N = 5 ;{1,2,3,-2,5}
O/P : 9
EXP : Max subarray sum is 9
      of elements (1, 2, 3, -2, 5) which
      is a contiguous subarray.
 */