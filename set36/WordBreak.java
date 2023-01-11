package zohoSets.set36;

public class WordBreak {

    public static void main(String[] args) {
        WordBreak wordBreak = new WordBreak();
        wordBreak.init();
    }

    private void init() {
        String[] arr = {"i", "like", "sam",
                "sung", "samsung", "mobile",
                "ice", "cream", "icecream",
                "man", "go", "mango"};
        String s = "ilikesamsung";
//        System.out.println(wordBreak(s, arr));
        wordBreak(s,arr);
    }

    public void wordBreak(String A, String[] B) {
//        return helper(A, B) == Boolean.TRUE ? 1 : 0;
        System.out.println(helper(A, B));
    }


    public String helper(String s, String[] words) {
        for (int i = 1; i < s.length() + 1; i++) {
            if (contain(s.substring(0, i), words))
//                return Boolean.TRUE;
                return s.substring(0, i) + " " + helper(s.substring(i), words);
        }
        return "";
    }

    public boolean contain(String w, String[] words) {
        for (String s : words) if (s.equals(w)) return Boolean.TRUE;
        return Boolean.FALSE;
    }
}
/*
I/P :   n = 12
        B = { "i", "like", "sam", "sung", "samsung", "mobile",
            "ice","cream", "icecream", "man", "go", "mango" }
        A = "ilikesamsung"
O/P :   1

EXP :   string can be segmented as - "i like samsung" or "i like sam sung".
 */