package zohoSets.set10;

import java.util.Scanner;

public class RegExImplementation {

    public static void main(String[] args) {
        RegExImplementation regex = new RegExImplementation();
        regex.init();
    }

    private void init() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER STRING : ");
        String string = scanner.next();
        System.out.println("ENTER REGEX : ");
        String regex = scanner.next();
        System.out.println("RESULT : " + (matcher(string, regex) ? "MATCH" : "NO-MATCH"));
    }

    private Boolean matcher(String passage, String regex) {

        int passLength = passage.length(), regLength = regex.length();

        if (passLength == 0 && regLength == 0)
            return Boolean.TRUE;

        if (regLength > 0 && passLength > 0) {
            if (regex.charAt(0) == '\\' && regex.charAt(1) == '*') {
                if (passage.charAt(0) == '*')
                    return matcher(passage.substring(1), regex.substring(2));
                else return Boolean.FALSE;
            }
            if (regex.charAt(0) == '*')
                return matcher(passage.substring(1), regex) ||
                        matcher(passage.substring(1), regex.substring(1));
            else if (regex.charAt(0) == passage.charAt(0))
                return matcher(passage.substring(1), regex.substring(1));
        }
        return Boolean.FALSE;
    }
}