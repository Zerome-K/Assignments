package zohoSets.set18;

public class MaximumSubArray {

    public static void main(String[] args) {
        MaximumSubArray maximumSubArray = new MaximumSubArray();
        maximumSubArray.init();
    }

    private void init() {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(findMax(arr));
    }

    private int findMax(int[] arr) {

        int totalSum = 0, currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (currentSum < 0)
                currentSum = 0;
            if (currentSum > totalSum)
                totalSum = currentSum;
        }
        return totalSum;
    }
}
/*
I/P : Arr = {-2 -3 4 -1 -2 1 5 -3}
O/P : 7 | elements [ 4 -1 -2 1 5]
 */