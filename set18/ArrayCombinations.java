package zohoSets.set18;

public class ArrayCombinations {
    public static void main(String[] args) {
        ArrayCombinations arrayCombinations = new ArrayCombinations();
        arrayCombinations.init();
    }

    private void init() {
        int[] arr = {8, 3, 4, 7, 9};
        int N = 7;
        findSum(arr, N, 0, 0, "");
    }

    private void findSum(int[] arr, int n, int start, int sum, String s) {

        for (int i = start; i < arr.length; i++) {
            s += arr[i] + ",";
            sum += arr[i];
            if (sum == n)
                System.out.println(s.substring(0, s.lastIndexOf(',')));
            findSum(arr, n, i + 1, sum, s);
            sum -= arr[i];
            int idx = s.lastIndexOf(String.valueOf(arr[i]));
            s = s.substring(0, idx);
        }
    }
}

/*
I/P : 8 3 4 7 9 N=7
O/P : {3 4 } {7}
 */
