package GeeksForGeeks.Medium;

import java.util.Arrays;

public class MinimizeTheHeightsI {
    public int getMinDiff(int k, int[] arr) {
        if(arr.length == 0 || arr.length == 1) return 0;
        
        Arrays.sort(arr);
        
        int minDiff = arr[arr.length - 1] - arr[0];
        
        for(int i = 1; i < arr.length; i++) {
            int min = Math.min(arr[0] + k, arr[i] - k);
            int max = Math.max(arr[arr.length - 1] - k, arr[i - 1] + k);
            minDiff = Math.min(minDiff, max - min);
        }
        
        return minDiff;
    }
}
