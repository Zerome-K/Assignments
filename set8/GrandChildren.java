package zohoSets.set8;

import java.util.Scanner;

public class GrandChildren {

    public static void main(String[] args) {
        GrandChildren grandChildren = new GrandChildren();
        grandChildren.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER NO OF PAIRS : ");
        int rows = scanner.nextInt();
        String[][] data = new String[rows][2];
        for (int i = 0; i < rows; i++) {
            System.out.print("ENTER CHILD NAME : ");
            String child = scanner.next();
            System.out.print("ENTER FATHER NAME : ");
            String father = scanner.next();
            data[i] = new String[]{child, father};
        }
        System.out.print("ENTER GRANDFATHER NAME : ");
        String gFather = scanner.next();
        System.out.println("NUMBER OF GRAND-CHILDREN'S : " + countGrandChildren(data, gFather));
    }

    private int countGrandChildren(String[][] data, String name) {
        int count = 0;
        for (String[] datum : data)
            if (datum[1].equals(name))
                for (String[] arr : data)
                    if (datum[0].equals(arr[1])) count++;
        return count;
    }
}
/*
 [ [‘Lava’ , ‘kusha] ,
[‘Rama’ , ‘Lava’] ,
[‘Lava ‘,’Ravanan’] ,
[‘Abi’ , ‘Lava’] ]
First string is the child & the second string is the parent. Print the no. of grand children available for the
given I/P.
I/P: Ravanan
O/P: 2
 */