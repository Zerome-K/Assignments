package zohoSets.set10;

public class StringMatching {
    public static void main(String[] args) {
        StringMatching stringMatching = new StringMatching();
        stringMatching.init();
    }

    private void init() {
        String passage = "jaka jana Gana Mana jana";
        String word = "jana";
        frequencies(passage, word);
    }

    private void frequencies(String passage, String word) {
        int[] table = lps(word);
        int index = 0, patternIndex = 0, n = passage.length(), m = word.length();
        while (index < n) {
            if (passage.charAt(index) == word.charAt(patternIndex)) {
                index++;
                patternIndex++;
                if (patternIndex == m) {
                    System.out.println("INDEX : " + (index - patternIndex));
                    patternIndex = table[patternIndex-1];
                }
            } else {
                if (patternIndex != 0) {
                    patternIndex = table[patternIndex - 1];
                    index++;
                }else index++;
            }
        }
    }

    private int[] lps(String word) {
        int[] table = new int[word.length()];
        int watcher = 0, idx = 1;
        table[0] = 0;
        while (idx < word.length()) {
            if (word.charAt(watcher) == word.charAt(idx)) {
                watcher++;
                table[idx] = watcher;
                idx++;
            } else {
                if (watcher == 0) table[idx++] = 0;
                else watcher = table[watcher - 1];
            }
        }
        return table;
    }

//    private void find(String passage, String word) {
//        int count = 0;
//        for (int idx = 0; idx < passage.length(); idx++) {
//            if (passage.charAt(idx) == word.charAt(0)) {
//                int i;
//                for (i = 0; i < word.length(); i++) {
//                    if (word.charAt(i) != passage.charAt(idx + i)) break;
//                }
//                if (i == word.length()) {
//                    System.out.println("INDEX : " + idx);
//                    count++;
//                }
//            }
//        }
//        System.out.println("TOTAL COUNT : " + count);
//    }
}
