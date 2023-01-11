package zohoSets.set17;

public class Occurances {

    public static void main(String[] args) {
        Occurances occurances = new Occurances();
        occurances.init();
    }

    private void init() {

        int[] arr = {2, 3, 2, 6, 1, 6, 2};
        countOcc(arr);
    }

    private void countOcc(int[] arr) {
        boolean[] tab = new boolean[arr.length];
        for (int i = 0; i < arr.length - 1; i++) {
            int count = 0;
            if (!tab[i]) {
                tab[i] = !tab[i];
                count++;
                for (int j = i + 1; j < arr.length; j++) {
                    if (!tab[j] && arr[j] == arr[i]) {
                        count++;
                        tab[j] = !tab[j];
                    }
                }
                System.out.println(arr[i] + " > " + count);
            }
        }
    }
}
