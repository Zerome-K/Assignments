package zohoSets.set38;

import java.util.Scanner;

public class Towers {

    public static void main(String[] args) {
        Towers towers = new Towers();
        towers.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER SIZE : ");
        int size = scanner.nextInt();
        int[] blocks = new int[size];
        for (int i = 0; i < size; i++) blocks[i] = scanner.nextInt();
        System.out.println("HEIGHT OF TOWERS");
        int t1 = scanner.nextInt();
        findHeights(blocks, t1);
        for (int i = 0; i < blocks.length; i++) {
            if (i == 3) System.out.print("& ");
            if (blocks[i] < 0) System.out.print(-blocks[i] + " ");
            else System.out.print(blocks[i] + " ");
        }
    }

    private void findHeights(int[] blocks, int t1) {
        outer:
        for (int i = 0; i < blocks.length - 2; i++)
            for (int j = i + 1; j < blocks.length - 1; j++)
                for (int k = j + 1; k < blocks.length; k++)
                    if (blocks[i] + blocks[j] + blocks[k] == t1) {
                        blocks[i] = -blocks[i];
                        blocks[j] = -blocks[j];
                        blocks[k] = -blocks[k];
                        break outer;
                    }
        mySort(blocks);
    }

    private void mySort(int[] blocks) {
        for (int i = 0; i < blocks.length; i++) {
            for (int j = 0; j < blocks.length - 1 - i; j++) {
                if (blocks[j] > blocks[j + 1])
                    blocks[j] = blocks[j] + blocks[j + 1] - (blocks[j + 1] = blocks[j]);
            }
        }
    }
}
/*
I/P : N = 6 , [10 15 90 65 30 25], HEIGHT OF TOWERS : 135,100
O/P : [90 30 15 & 10 25 65]
 */