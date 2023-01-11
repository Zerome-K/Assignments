package zohoSets.set24;

import java.util.Scanner;

public class FormRec {

    public static void main(String[] args) {
        FormRec formRec = new FormRec();
        formRec.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER 4 POINTS : ");
        int[] points = new int[4];
        for (int i = 0; i < 4; i++) points[i] = scanner.nextInt();
        System.out.println(isRectangle(points));
    }

    private boolean isRectangle(int[] p) {
        if (p[0] == p[1] && p[0] == p[2] && p[0] == p[3] && p[1] == p[2] && p[1] == p[3] &&
                p[2] == p[3]) return Boolean.TRUE;
        else if (p[0] == p[1] && p[2] == p[3]) return Boolean.TRUE;
        else if (p[0] == p[3] && p[1] == p[2]) return Boolean.TRUE;
        else if (p[0] == p[2] && p[1] == p[3]) return Boolean.TRUE;
        else return Boolean.FALSE;
    }
}
