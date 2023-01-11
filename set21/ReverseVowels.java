package zohoSets.set21;

import java.util.Scanner;

public class ReverseVowels {

    public static void main(String[] args) {
        ReverseVowels reverseVowels = new ReverseVowels();
        reverseVowels.init();
    }

    private void init() {
        System.out.println("ENTER STRING : ");
        String str = new Scanner(System.in).nextLine();
        reverseVowel(str);
    }

    private void reverseVowel(String str) {
        char[] arr = str.toCharArray();
        int start = 0, end = str.length()-1;
        while (start < end) {
            if (isVowel(arr[start]) && isVowel(arr[end])) {
                arr[start] = (char) (arr[start] + arr[end] - (arr[end] = arr[start]));
                start++;
                end--;
            } else if (!isVowel(arr[start])) start++;
            else end--;
        }
        for (char c : arr) {
            System.out.print(c);
        }
    }

    public boolean isVowel(char ch) {
        return "aeiouAeiou".contains(String.valueOf(ch));
    }
}

/*
Input : abcdef
Output : ebcdaf
 */
