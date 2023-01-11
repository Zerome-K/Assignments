package zohoSets.set23;

public class LongestContinous {

    public static void main(String[] args) {
        LongestContinous longestContinous = new LongestContinous();
        longestContinous.init();
    }

    private void init() {
        int[] arr = {1, 2, 3, 4, 7, 8, 9, 10};
        find(arr);
    }

    private void find(int[] arr) {
        sort(arr);
        int start = 0, end = 0, count = 1;
        for (int i = 1; i <= arr.length; i++) {
            if (i == arr.length || arr[i - 1] != arr[i] - 1) {
                if (end - start < i - (i - count)) {
                    start = i - count;
                    end = i;
                }
                count = 1;
            } else count++;
        }
        for (int i = start; i < end; i++) {
            System.out.println(arr[i]);
        }
    }

    int findLongestConseqSubseq(int arr[], int N) {
        sort(arr);
        int count = 1, num = arr[0] + 1, total = 0;
        for (int i = 1; i < arr.length; i++) {
            if (num < arr[i]) {
                total = Math.max(count, total);
                num = arr[i] + 1;
                count = 1;
            } else if (arr[i] == num) {
                count++;
                num = num + 1;
            }
        }
        total = Math.max(count, total);
        return total;
    }

    private void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i], j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
