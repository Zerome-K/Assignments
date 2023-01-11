package zohoSets.set10;

public class Frequency {

    public static void main(String[] args) {
        Frequency frequency = new Frequency();
        frequency.init();
    }

    private void init() {
        int[] array = {2, 1, 3, 2, 2, 5, 8, 9, 8};
        freq(array);
    }

    private void freq(int[] array) {
        boolean[] visited = new boolean[array.length];
        System.out.println("FREQUENCIES");
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            if (!visited[i]) {
                for (int j = i; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        count++;
                        visited[j] = !visited[j];
                    }
                }
                System.out.println(array[i] + "->" + count);
            }
        }
    }
}
