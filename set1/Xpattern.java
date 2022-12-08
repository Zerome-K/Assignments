package zohoSets.set1;

public class Xpattern {


    public static void xpattern(String string) {

        for (int i = 0; i < string.length(); i++) {

            for (int j = 0; j < string.length(); j++) {

                if (j == i || (j + i == string.length() - 1))

                    System.out.print(string.charAt(j));

                else System.out.print("  ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        String a = "WELCOMETOZOHOCORPORATION";
        xpattern(a);
    }


}
