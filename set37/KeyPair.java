package zohoSets.set37;

import java.util.Arrays;

public class KeyPair {

    public static void main(String[] args) {
        KeyPair keyPair = new KeyPair();
        keyPair.init();
    }

    private void init() {
        int[] arr = {1, 2, 4, 3, 5, 6};
        int x = 5;
//        findPairs(arr, x);
        hasArrayTwoCandidates(arr,arr.length,x);
    }

//    METHOD - 1
//    private void findPairs(int[] arr, int x) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] + arr[j] == x)
//                    System.out.println("(" + arr[i] + ", " + arr[j] + ')');
//            }
//        }
//    }

//    METHOD - 2
    private void hasArrayTwoCandidates(int[] arr, int n, int x) {
        Arrays.sort(arr);
        int start = 0, end = n-1;
        while(start < end){
            if(arr[start] + arr[end] == x){
//                return true;
                System.out.println("(" + arr[start++] + ", " + arr[end--] + ')');
            }
            else if(arr[start] + arr[end] > x)end--;
            else start++;
        }

    }
}

/*
I/P :  {1, 2, 4, 3, 5, 6}, SUM : 5
O/P :  2 (1, 4) & (2, 3)
 */
