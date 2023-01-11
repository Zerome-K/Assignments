package zohoSets.set23;

public class MaxinWindow {

    public static void main(String[] args) {
        MaxinWindow maxinWindow = new MaxinWindow();
        maxinWindow.init();
    }

    private void init() {
        int[] arr = {1, 3, 5, 2, 1, 8, 6, 9};
        int wSize = 3;
        printMax(arr, wSize);
    }

    private void printMax(int[] arr, int wSize) {
        for (int i = 0; i <= arr.length - wSize; i++) {
            int max = arr[i];
            for (int j = 1; j < wSize; j++) {
                if (arr[i+j] > max) max = arr[j+i];
            }
            System.out.println(max + " ");
        }
    }
}
