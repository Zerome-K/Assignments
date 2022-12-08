package zohoSets.set6;

import java.util.Scanner;

public class PossibleWords {

    public static void main(String[] args) {
        PossibleWords possibleWords = new PossibleWords();
        possibleWords.init();
    }

    private void init() {
        String number = new Scanner(System.in).next();
        find(number, "");
    }

    private void find(String number, String combination) {

        if (number.length() == 0) {
            System.out.println(combination);
            return;
        }

        int n = Character.getNumericValue(number.charAt(0));
        find(number.substring(1), combination + ((char) ('A' + n - 1)));

        if (number.length() >= 2) {
            int num = Integer.parseInt(number.substring(0, 2));
            if (num <= 26) find(number.substring(2), combination + ((char) ('A' + num - 1)));
        }
    }
}
