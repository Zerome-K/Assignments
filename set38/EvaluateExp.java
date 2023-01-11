package zohoSets.set38;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class EvaluateExp {

    private static class ExpValue {
        String exp;
        int val;

        ExpValue(String exp, int val) {
            this.exp = exp;
            this.val = val;
        }
    }

    public static void main(String[] args) {
        EvaluateExp evaluateExp = new EvaluateExp();
        evaluateExp.init();
    }

    private void init() {
        System.out.print("ENTER SIZE : ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.nextLine();
        ExpValue[] exp = new ExpValue[size];
        System.out.print("ENTER EXPRESSIONS : ");
        for (int i = 0; i < size; i++) {
            String expression = scanner.next();
            exp[i] = new ExpValue(expression, eval(expression));
        }
        Arrays.sort(exp, Comparator.comparingInt(n -> n.val));
        for (ExpValue x : exp) {
            System.out.print(x.exp + " - ");
        }
    }

//    private void evaluate(String[] exp) {
//        for (int i = 0; i < exp.length; i++) exp[i] = eval(exp[i]);
//        Arrays.sort(exp, (n, m) -> Integer.parseInt(n, 1) - Integer.parseInt(m));
//    }

    private int eval(String s) {
        char[] arr = s.toCharArray();
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^') {
                res += compute(arr[i], arr[i-1] - '0', arr[i + 1] - '0');
                i += 2;
            }else res += arr[i];
        }
        if (res == 0) return Integer.parseInt(s);
        return res;
    }

    private int compute(char operator, int a, int b) {
        switch (operator) {
            case '+' -> {
                return a + b;
            }
            case '-' -> {
                return a - b;
            }
            case '*' -> {
                return a * b;
            }
            case '/' -> {
                return a / b;
            }
            case '^' -> {
                int res = a;
                while (b-- > 1) {
                    res *= a;
                }
                return res;
            }
        }
        return 0;
    }
}
