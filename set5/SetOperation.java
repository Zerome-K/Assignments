package zohoSets.set5;

public class SetOperation {

    public static void main(String[] args) {
        SetOperation setOperation = new SetOperation();
        setOperation.init();
    }

    private void init() {
        int[] list1 = {1, 3, 4, 5, 6, 8, 9};
        int[] list2 = {1, 5, 8, 9, 2};
        intersection(list1, list2);
        union(list1, list2);
        except(list1, list2);
    }

    private void except(int[] list1, int[] list2) {
        System.out.print("EXCEPT : ");
        for (int x : list1) if (x % 2 == 1) System.out.print(x + " ");
        for (int x : list2) if (x % 2 == 0) System.out.print(x + " ");
        System.out.println();
    }

    private void union(int[] list1, int[] list2) {

        int[] union = new int[list1.length + list2.length];

        int k = 0;
        for (int x : list1) {
            if (contain(union, x))
                union[k++] = x;
        }
        for (int x : list2) {
            if (contain(union, x))
                union[k++] = x;
        }

        System.out.print("UNION : ");
        for (int i = 0; i < k; i++) System.out.print(union[i] + " ");
        System.out.println();
    }

    private boolean contain(int[] union, int x) {
        for (int j : union) if (j == x) return false;
        return true;
    }

    private void intersection(int[] list1, int[] list2) {
        System.out.print("INTERSECTION : ");
        outer:
        for (int j : list1) {
            for (int k : list2) {
                if (j == k) {
                    System.out.print(j + " ");
                    continue outer;
                }
            }
        }
        System.out.println();
    }
}

/*
List 1: 1,3,4,5,6,8,9
List 2: 1, 5,8,9,2

Union: 1, 3,4,5,6,8,9,2
Intersection: 1,5,8,9
Except: 1, 3, 5,9,8,2
 */
