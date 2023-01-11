package zohoSets.set23;


public class NoDuplicates {

    public static void main(String[] args) {
        NoDuplicates noDuplicates = new NoDuplicates();
        noDuplicates.init();
    }

    private void init() {
        int[] arr = {10, 70, 30, 90, 20, 20, 30, 40, 70, 50};
        sort(arr, 0, arr.length - 1);
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i == 0 || arr[i] != arr[i-1])
                arr[x++] = arr[i];
        }
        printArray(arr,x);
    }

    private void printArray(int[] arr, int x) {
        for (int i = 0; i < x; i++) {
            System.out.print(arr[i] + " -> ");
        }
    }

    private void sort(int[] arr, int s, int e) {
        int pi;
        if (s < e) {
            pi = partition(arr, s, e);
            sort(arr, s, pi - 1);
            sort(arr, pi + 1, e);
        }
    }

    private int partition(int[] arr, int s, int e) {
        int pivot = arr[e], idx = s - 1;
        for (int i = s; i < e; i++) {
            if (arr[i] < pivot) {
                idx++;
                arr[idx] = arr[idx] + arr[i] - (arr[i] = arr[idx]);
            }
        }
        arr[idx + 1] = pivot + arr[idx + 1] - (arr[e] = arr[idx + 1]);
        return idx + 1;
    }
}
/*
INPUT  :

  Enter the array size  :  4
  Enter the elements  :  1 1 2 4

  OUTPUT  : 1 2 4
 */