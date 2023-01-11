package zohoSets.set13;

import java.util.Scanner;

public class CountCharacters {

    public static void main(String[] args) {
        CountCharacters countCharacters = new CountCharacters();
        countCharacters.init();
    }

    private void init() {
        System.out.print("ENTER NUMBER : ");
        int num = new Scanner(System.in).nextInt();
        System.out.println("TOTAL CHARACTERS : " + countCharacter(num));
    }

    private int countCharacter(int num) {

        int div = 1, count = 0, result = 0;

        while (div < num) {
            count++;
            div *= 10;
        }

        div /= 10;
        int n = num - div;
        result += (n + 1) * count--;
        n = div;
        div /= 10;

        while (count > 0) {
            result += (n - div) * count;
            n = div;
            div /= 10;
            count--;
        }
        return result;
    }
}
