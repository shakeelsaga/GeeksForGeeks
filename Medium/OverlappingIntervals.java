package GeeksForGeeks.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OverlappingIntervals {
    public List<int[]> mergeOverlap(int[][] arr) {
        List<int[]> intervals = new ArrayList<>();
        
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        
        int start = arr[0][0];
        int end = arr[0][1];
        
        
        int i = 1;
        while(i < arr.length) {
            if(arr[i][0] <= end) {
                end = Math.max(end, arr[i][1]);
            } else {
                intervals.add(new int[]{start, end});
                start = arr[i][0];
                end = arr[i][1];
            }
            i++;
        }
        intervals.add(new int[]{start, end});
        
        return intervals;
    }
}
