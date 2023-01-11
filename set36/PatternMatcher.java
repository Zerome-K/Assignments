package zohoSets.set36;

import java.util.Scanner;
public class PatternMatcher {

    public static void main(String[] args) {
        PatternMatcher patternMatcher = new PatternMatcher();
        patternMatcher.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER STRING : ");
        String str = scanner.next();
        System.out.print("ENTER PATTERN : ");
        String pattern = scanner.next();
        findPattern(str, pattern);
    }

    private void findPattern(String str, String pattern) {
        char[] to = pattern.toCharArray();
        String compiledPattern = "" + to[0];
        for (int i = 1; i < to.length; i++) {
            if (to[i] == '*' && to[i - 1] == '*') continue;
            compiledPattern += to[i];
        }
        System.out.println("RESULT : " + isMatching(str, compiledPattern));
    }

    private boolean isMatching(String str, String pattern) {
        if (pattern.length() == 0 && str.length() == 0)
            return Boolean.TRUE;
        if (pattern.length() == 0)
            return Boolean.FALSE;
        if (str.length() == 0) {
            for (int i = 0; i < pattern.length(); i++)
                if (pattern.charAt(i) != '*')
                    return Boolean.FALSE;
            return Boolean.TRUE;
        }
        char ch = pattern.charAt(0);
        if (ch == '*') {
            if (isMatching(str, pattern.substring(1)) || isMatching(str.substring(1), pattern))
                return Boolean.TRUE;
        } else if (ch == '?' || ch == str.charAt(0))
            return isMatching(str.substring(1), pattern.substring(1));
        return Boolean.FALSE;
    }
}

/*
I/P : Text = “baaabab” ; Pattern = “*****ba*****ab”,
O/P : true
T/C : -> Pattern = “baaa?ab”, output : true
      -> Pattern = “ba*a?”, output : true
      -> Pattern = “a*ab”, output : false
*/