package zohoSets.set13;

public class SquarePattern {

    public static void main(String[] args) {
        SquarePattern squarePattern = new SquarePattern();
        squarePattern.init();
    }

    private void init() {
        int n = 6;
        printPattern(n);
    }

    private void printPattern(int n) {
        int x = n * 2;
        for (int i = 0; i < x - 1; i++) {
            for (int j = 0; j < x - 1; j++) {
                int num = Math.min(Math.min(i, j), Math.min((x - 2) - j, (x - 2) - i));
                System.out.print(n - num + " ");
            }
            System.out.println();
        }
    }
}
