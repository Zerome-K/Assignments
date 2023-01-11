package zohoSets.set17;

public class Pattern {

    public static void main(String[] args) {
        Pattern pattern = new Pattern();
        pattern.init();
    }

    private void init() {
        String str = "PROGRAM";
        printPattern(str);
    }

    private void printPattern(String str) {

        for (int i = 1; i <= str.length(); i++) {
            for (int j = 0; j < i; j++)
                System.out.print(str.charAt((str.length() / 2 + j) % str.length()));
            System.out.println();
        }
    }
}

/*

 I/P : PROGRAM
 O/P :
 G
 GR
 GRA
 GRAM
 GRAMP
 GRAMPR
 GRAMPRO
 */
