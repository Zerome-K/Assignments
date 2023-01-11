package zohoSets.set26;

public class isFibonacci {

    public static void main(String[] args) {
        isFibonacci isFibonacci = new isFibonacci();
        isFibonacci.init();
    }

    private void init() {

        int[] arr = {1, 10, 6, 8, 13, 21};
        findFibonacci(arr);
    }

    private void findFibonacci(int[] arr) {
        for (int x : arr) {
            if (test(x))
                System.out.println(x);
        }
    }

    private boolean test(int x) {
        return isPerfect(5 * x * x + 4) || isPerfect(5 * x * x - 4);
    }

    private boolean isPerfect(int num) {
        int i = 1;
        while (i * i < num) i++;
        return i * i == num;
    }
}
