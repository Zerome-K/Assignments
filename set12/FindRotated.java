package zohoSets.set12;

public class FindRotated {

    public static void main(String[] args) {
        FindRotated findRotated = new FindRotated();
        findRotated.init();
    }

    private void init() {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] arr1 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        System.out.println(findByRotation(arr, arr1) ?
                "" : "FALSE");
    }

    private boolean findByRotation(int[][] arr, int[][] arr1) {

        if (isPresent(arr, arr1)) return Boolean.TRUE;
        int i = 1;
        while (i++ <= 3) {
            transpose(arr);
            swapColumns(arr);
            if (isPresent(arr, arr1)) {
                System.out.print("FOUND IN " + 90 * (i - 1) + " DEGREE ROTATION");
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    private boolean isPresent(int[][] arr, int[][] arr1) {
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[0].length; j++)
                if (arr[i][j] != arr1[i][j]) return Boolean.FALSE;
        return Boolean.TRUE;
    }

    private void swapColumns(int[][] arr) {
        for (int i = 0; i < arr[0].length / 2; i++)
            for (int j = 0; j < arr.length; j++) {
                arr[j][i] = arr[j][arr.length - 1 - i] + arr[j][i] -
                        (arr[j][arr.length - 1 - i] = arr[j][i]);
            }
    }

    private void transpose(int[][] arr) {
        for (int i = 0; i < arr.length; i++)
            for (int j = i; j < arr[i].length; j++)
                if (i != j)
                    arr[i][j] = arr[i][j] + arr[j][i] - (arr[j][i] = arr[i][j]);
    }
}
/*
int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

int[][] arr1 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}};

        O/P : FOUND IN 180 DEGREE
 */