package zohoSets.set23;

public class FindUnion {
    public static void main(String[] args) {
        FindUnion findUnion = new FindUnion();
        findUnion.init();
    }

    private void init() {
        int[] arr1 = {1, 2, 3, 4, 5, 3};
        int[] arr2 = {1, 2, 7, 5};
        union(arr1, arr2);
    }

    private void union(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length + arr2.length];
        int k = 0;
        for (int j : arr1)
            if (!isPresent(k, res, j))
                res[k++] = j;
        for (int x:arr2)
            if(!isPresent(k,res,x))
                res[k++] = x;
        for (int i = 0; i < k; i++) {
            System.out.print(res[i] + "->");
        }
    }
    private boolean isPresent(int k, int[] res, int i) {
        for (int j = 0; j < k; j++) if (res[j] == i) return Boolean.TRUE;
        return Boolean.FALSE;
    }

}
