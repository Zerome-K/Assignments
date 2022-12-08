package zohoSets.set2;

import java.util.Scanner;

public class NumberSystem3and4 {

    public static void main(String[] args) {
        NumberSystem3and4 ns = new NumberSystem3and4();
        ns.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER POSITION : ");
        int pos = scanner.nextInt();
        System.out.println(numberSystemNth(pos));
    }

    private int numberSystemNth(int pos) {

        String[] arr = new String[pos + 1];

        arr[0] = "";

        int size = 1, m = 1;

        while (size <= pos) {

            for (int idx = 0; idx < m && (size + idx <= pos); idx++)
                arr[size + idx] = "3" + arr[size + idx - m];

            for (int idx = 0; idx < m && (size + m + idx <= pos); idx++) {
                arr[size + m + idx] = "4" + arr[size + idx - m];
            }

            m = m << 1;
            size += m;
        }
        return Integer.parseInt(arr[pos]);
    }

}
