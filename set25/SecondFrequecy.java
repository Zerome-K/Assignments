package zohoSets.set25;

import java.util.Scanner;

public class SecondFrequecy {

    static class Frequency {
        int val, freq;

        Frequency(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        SecondFrequecy secondFrequecy = new SecondFrequecy();
        secondFrequecy.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER SIZE : ");
        int size = scanner.nextInt();
        Frequency[] arr = new Frequency[size];
        for (int i = 0; i < size; i++) {
            int num = scanner.nextInt();
        }
    }

    private boolean present(Frequency[] arr, int i, int num) {
        for (Frequency f:arr) {
//            if(f.val == num)
        }
        return true;
    }
}
