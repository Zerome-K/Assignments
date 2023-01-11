package zohoSets.set39;

import java.util.Scanner;

public class PasswordStrength {

    public static void main(String[] args) {
        PasswordStrength ps = new PasswordStrength();
        ps.init();
    }

    private void init() {
        for (int i = 0; i < 4; i++) {
            System.out.print("ENTER PASSWORD : ");
            String password = new Scanner(System.in).next();
            System.out.println("STRENGTH : " + getStrength(password));
        }
    }

    private String getStrength(String password) {
        if (password.length() < 6) return "WEAK";
        int num = 0, caps = 0, special = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if ('a' <= ch && ch <= 'z') continue;
            if ('0' <= ch && ch <= '9') num = 1;
            else if ('A' <= ch && ch <= 'Z') caps = 1;
            else special = 1;
        }
        int res = num + caps + special;
        if (res == 1) return "MEDIUM";
        else if (res == 2) return "GOOD";
        return "STRONG";
    }
}
/*
I/P: Qw!1            O/P: Weak
I/P: Qwertyuiop      O/P: Medium
I/P: QwertY123       O/P: Good
I/P: Qwerty@123      O/P: Strong
 */