package zohoSets.set39;

import java.util.Scanner;

public class CricketScore {

    public static void main(String[] args) {
        CricketScore cricketScore = new CricketScore();
        cricketScore.init();
    }

    private void init() {
        System.out.print("ENTER TIMELINE : ");
        String timeLine = new Scanner(System.in).nextLine();
        int[] scores = getScore(timeLine);
        System.out.println("P1 - " + scores[0] + " p2 - " + scores[1] + " EXTRAS - " + scores[2]);
    }

    private int[] getScore(String timeLine) {
        int p1 = 0, p2 = 0, extras = 0;
        boolean flag = false;
        for (int i = 1; i <= timeLine.length(); i++) {
            char ch = timeLine.charAt(i - 1);
            byte hit = 0;
            if (ch == 'N' || ch == 'W') extras++;
            else if ('1' <= ch && ch <= '6') {
                hit = (byte) (ch - '0');
                if (flag) p1 += hit;
                else p2 += hit;
            }
            if ((i % 6 == 0 && (ch == '.' || (hit & 1) == 0)) || (hit & 1) == 0)
                flag = !flag;
        }
        return new int[]{p1, p2, extras};
    }
}
/*
I/P : OVERS - 1 . 2 . 4 3 6 W 1 . N . 2 1

O/P : P1 – 8, P2 – 12, Extras – 2
 */