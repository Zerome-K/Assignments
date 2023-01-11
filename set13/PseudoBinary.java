package zohoSets.set13;

import java.util.Scanner;

public class PseudoBinary {

    public static void main(String[] args) {
        PseudoBinary pseudoBinary = new PseudoBinary();
        pseudoBinary.init();
    }

    private void init() {
        System.out.print("ENTER NUMBER  : ");
        int number = new Scanner(System.in).nextInt();
        System.out.print("PSEUDO BINARIES : ");
        findPseudos(number);
    }

    private void findPseudos(int number) {

        while (number != 0) {
            int n = number, temp = 0, p = 1;
            while (n > 0) {
                int rem = n % 10;
                n /= 10;
                if (rem != 0)
                    temp += p;
                p *= 10;
            }
            System.out.print(temp + " ");
            number -= temp;
        }
    }
}
