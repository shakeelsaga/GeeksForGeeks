package GeeksForGeeks.Medium;

import java.util.Arrays;

public class AggressiveCows {
    private static boolean canBePlaced(int arr[], int k, int mid) {
        int cows = 0, prevStall = -1;
        for(int i : arr) {
            if(prevStall == -1 || (i - prevStall) >= mid) {
                cows++;
                prevStall = i;
            }
        }
        return cows >= k;
    }
    public static int aggressiveCows(int[] stalls, int k) {
        int n = stalls.length;
        
        Arrays.sort(stalls);
        
        int low = 1;
        int high = stalls[n - 1] - stalls[0];
        int minDist = 0;
        
        while(low <= high) {
            int mid = low + (high - low)/2;
            if(canBePlaced(stalls, k, mid)) {
                minDist = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return minDist;
    }
}
