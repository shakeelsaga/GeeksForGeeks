package GeeksForGeeks.Medium;

import java.util.ArrayList;

public class InsertInterval {
    static ArrayList<int[]> insertInterval(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> list = new ArrayList<>();
        
        int i = 0;
        int n = intervals.length;
        
        while (i < n && intervals[i][1] < newInterval[0]) {
            list.add(new int[]{intervals[i][0], intervals[i][1]});
            i++;
        }
        
        int start = newInterval[0];
        int end = newInterval[1];
        while (i < n && intervals[i][0] <= newInterval[1]) {
            start = Math.min(start, intervals[i][0]);
            end = Math.max(end, intervals[i][1]);
            i++;
        }
        list.add(new int[]{start, end});
        
        while (i < n) {
            list.add(new int[]{intervals[i][0], intervals[i][1]});
            i++;
        }
        
        return list;
    }
}
