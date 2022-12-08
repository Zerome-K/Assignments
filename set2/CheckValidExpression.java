package zohoSets.set2;

import java.util.Scanner;

public class CheckValidExpression {

    public static void main(String[] args) {
        CheckValidExpression expression = new CheckValidExpression();
        expression.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER EXPRESSION : ");
        String expression = scanner.next();
        System.out.println("GIVEN EXPRESSION : " + check(expression));
    }

    private String check(String expression) {
        int openCount = 0, closeCount = 0;
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (ch == '(') openCount++;
            else if (ch == ')') closeCount++;
            if (ch == '*' || ch == '+' || ch == '-' || ch == '/') {
                if (i + 1 == expression.length()) return "INVALID";
                else if (expression.charAt(i - 1) != 'a' || expression.charAt(i + 1) != 'b')
                    return "IN-VALID";
            }
        }
        if (openCount != closeCount) return "INVALID";
        return "VALID";
    }
}
