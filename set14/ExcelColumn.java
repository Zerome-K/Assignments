package zohoSets.set14;

import java.util.Scanner;

public class ExcelColumn {

    public static void main(String[] args) {
        ExcelColumn excelColumn = new ExcelColumn();
        excelColumn.init();
    }

    private void init() {

        System.out.print("ENTER NUMBER : ");
        int number = new Scanner(System.in).nextInt();
        findColumn(number);
    }

    private void findColumn(int number) {

        String result = "";
        while (number > 0) {
            int rem = number % 26;
            if (rem == 0) {
                result += "Z";
                number = (number / 26) - 1;
            } else {
                result += (char) ((rem - 1) + 'A');
                number = number / 26;
            }
        }
        for (int i = result.length() - 1; i >= 0; i--) {
            System.out.print(result.charAt(i));
        }
    }
}
