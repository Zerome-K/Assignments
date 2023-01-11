package zohoSets.set15;

public class MinimumGreater {

    public static void main(String[] args) {
        MinimumGreater minimumGreater = new MinimumGreater();
        minimumGreater.init();
    }

    private void init() {
        int[] arr = {2, 3, 7, 1, 8, 9, 5, 11};
        findMinimumGreater(arr);
    }

    private void findMinimumGreater(int[] arr) {
        int[] temp = new int[arr.length];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        quickSort(temp, 0, temp.length - 1);
        for (int x : arr) {
            boolean flag = true;
            for (int y : temp) {
                if (y > x) {
                    System.out.println(x + ">" + y);
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.println(x + ">" + x);
        }
    }

    private void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int partition = partition(arr, start, end);
            quickSort(arr, 0, partition - 1);
            quickSort(arr, partition + 1, end);
        }
    }

    private int partition(int[] arr, int start, int end) {
        int pivot = arr[end], smallIndex = start - 1;
        for (int i = start; i < end; i++) {
            if (arr[i] < pivot) {
                smallIndex++;
                arr[smallIndex] = arr[smallIndex] + arr[i] - (arr[i] = arr[smallIndex]);
            }
        }
        arr[smallIndex + 1] = arr[smallIndex + 1] + arr[end] - (arr[end] = arr[smallIndex + 1]);
        return smallIndex + 1;
    }
}
/*
Sample:
Array : {2, 3, 7, 1, 8, 5, 11}

Output:
{2>3, 3>5, 7>8, 1>2, 8>11, 5>7, 11>}
 */