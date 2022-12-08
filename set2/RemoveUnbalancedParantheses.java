package zohoSets.set2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveUnbalancedParantheses {

    public static void main(String[] args) {
        RemoveUnbalancedParantheses rup = new RemoveUnbalancedParantheses();
        rup.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER STRING : ");
        String str = scanner.next();
        List<String> ans = new ArrayList<>();
        remove(str, ans, 0, 0, new char[]{'(', ')'});
        System.out.println(ans);
    }

    private void remove(String str, List<String> list, int startToCount, int startToRemove, char[] para) {
        for (int count = 0, idx = startToCount; idx < str.length(); idx++) {
            if (str.charAt(idx) == para[0]) count++;
            else if (str.charAt(idx) == para[1]) count--;
            if (count >= 0) continue;
            for (int removeIdx = startToRemove; removeIdx < idx; removeIdx++) {
                if (str.charAt(removeIdx) == para[1] && (removeIdx == startToRemove || str.charAt(removeIdx - 1) != para[1])) {
                    String newStr = str.substring(0, removeIdx) + str.substring(removeIdx + 1);
                    remove(newStr, list, idx, removeIdx, para);
                }
            }
            return;
        }

        String reversed = new StringBuilder(str).reverse().toString();
        if (para[0] == '(')
            remove(reversed, list, 0, 0, new char[]{')', '('});
        else list.add(reversed);
    }
}
