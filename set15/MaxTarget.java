package zohoSets.set15;

public class MaxTarget {

    public static void main(String[] args) {
        MaxTarget maxTarget = new MaxTarget();
        maxTarget.init();
    }

    private void init() {
        int[] arr = {2, -7, 5, 7, 5, 4, 9, 7, -2, 22, 25};
        int target = 10;
//        find(arr, target);
        kadane(arr);
    }

    private void kadane(int[] arr) {

        int totalSum = 0, currentSum = 0, start = 0,
                end = 0, toggler = 0, i = 0;

        for (; i < arr.length; i++) {
            if (arr[i] < 0) {
                if (currentSum > totalSum) {
                    totalSum = currentSum;
                    start = toggler + 1;
                    end = i - 1;
                }
                toggler = i;
                currentSum = 0;
            }
            currentSum += arr[i];
        }

        if (totalSum < currentSum) {
            totalSum = currentSum;
            start = toggler + 1;
            end = i - 1;
        }
        System.out.println("MAX : " + totalSum);
        printArray(arr, start, end);
    }

    private void find(int[] arr, int target) {
        int currentSum = 0, watcher = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                currentSum = 0;
                watcher = i + 1;
                continue;
            }
            currentSum += arr[i];
            if (currentSum == target) {
                printArray(arr, watcher, i);
                break;
            }
            if (currentSum > target)
                currentSum -= arr[watcher++];
        }
    }

    private void printArray(int[] arr, int start, int end) {
        for (int i = start; i <= end; i++) System.out.print(arr[i] + " ");
    }
}

/*
Sample:
Array : {2, 7, 5, 1, 3, 2, 9, 7}

Output:
     Sum : 14
     Elements : 3, 2, 9
 */
