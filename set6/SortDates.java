package zohoSets.set6;

import java.util.Arrays;

public class SortDates {

    public static void main(String[] args) {
        SortDates sortDates = new SortDates();
        sortDates.init();
    }

    private void init() {
        int[][] dates = {{19, 2, 2017}, {18, 3, 2017}, {18, 2, 2017}, {30, 12, 1978}};

        sortDates(dates);
        System.out.println(Arrays.deepToString(dates));
    }

    private void sortDates(int[][] dates) {

        for (int i = 0; i < dates.length - 1; i++) {
            int mark = i;
            int[] min = dates[i];
            for (int j = i + 1; j < dates.length; j++) {
                if (min[2] >= dates[j][2])
                    if (min[2] == dates[j][2]) {
                        if (min[1] >= dates[j][1]) {
                            if (min[1] == dates[j][1]) {
                                if (min[0] > dates[j][0]) {
                                    min = dates[j];
                                    mark = j;
                                }
                            } else {
                                min = dates[j];
                                mark = j;
                            }
                        }
                    }else {
                        min = dates[j];
                        mark = j;
                    }
            }
            dates[mark] = dates[i];
            dates[i] = min;
        }
    }

    private int[] split(String str) {
        int[] result = new int[3];
        str += '\0';
        int idx = 0;
        String number = "";
        for (int i = 0; str.charAt(i) != '\0'; i++) {
            if (str.charAt(i) != '-') number += str.charAt(i);
            else result[idx] = Integer.parseInt(number);
        }
        return result;
    }
}
