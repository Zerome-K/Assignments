package zohoSets.set24;

import java.util.Arrays;

public class InsertInArray {

    public static void main(String[] args) {
        InsertInArray insertInArray = new InsertInArray();
        insertInArray.init();
    }

    private void init() {
        int[] arr = {4, 5, 6, 4, 5};
        int pos = 2;
        insert(arr, pos, 10);
    }

    private void insert(int[] arr, int pos, int num) {
        int[] newArr = new int[arr.length + 1];
        int k = 0;
        for (int i = 0; i < newArr.length; i++) {
            if (i == pos)
                newArr[i] = num;
            else newArr[i] = arr[k++];
        }
        System.out.println(Arrays.toString(newArr));
    }
}
