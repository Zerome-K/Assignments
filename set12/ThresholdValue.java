package zohoSets.set12;

public class ThresholdValue {

    public static void main(String[] args) {
        ThresholdValue thresholdValue = new ThresholdValue();
        thresholdValue.init();
    }

    private void init() {
        int[] arr = {5, 8, 10, 13, 6, 2};
        int threshold = 4;
        System.out.println("THRESHOLD COUNT : " + getThreshold(arr, threshold));
    }

    private int getThreshold(int[] arr, int threshold) {
        int count = 0;
        for (int num : arr) {
            count += num / threshold;
            if (num % threshold != 0) count++;
        }
        return count;
    }
}

/*
EX -  I/P Arr = {5,8,10,13,6,2}; Threshold = 3 | O/P  count = 17

      explanation:
      Number	    parts	            counts
       5	        {3,2}                 2
       8           {3,3,2}                3
       10          {3,3,3,1}              4
       13         {3,3,3,3,1}             5
       6            {3,3}                 2
       2            {2}                   1
 */