package zohoSets.set32;

import java.util.Scanner;

public class FindAnagrams {

    public static void main(String[] args) {
        FindAnagrams fa = new FindAnagrams();
        fa.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER SIZE : ");
        int size = scanner.nextInt();
        scanner.nextLine();
        String[] arr = new String[size];
        for (int i = 0; i < size; i++) arr[i] = scanner.next();
        System.out.print("ENTER WORD : ");
        String word = scanner.next();
        findAnagrams(arr, word);
    }

    private void findAnagrams(String[] arr, String word) {
        System.out.print("ANAGRAMS : ");
        for (String str : arr) {
            if (containsAna(str, word))
                System.out.print(str + " ");
        }
    }

    private boolean containsAna(String str, String word) {
        if (word.length() != str.length()) return Boolean.FALSE;
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += word.charAt(i);
            sum -= str.charAt(i);
        }
        return sum == 0;
    }
}
/*
I/P : [catch, got, tiger, mat, eat, Pat, tap, tea] ; Word: ate :

O/P : [eat, tea]
 */