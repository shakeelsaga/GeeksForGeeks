package GeeksForGeeks.Medium;

import java.util.HashMap;
import java.util.Map;

public class LargestSubArrayWithSumZero {
    int maxLen(int arr[]) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        int maxLength = 0;
        int sum = 0;
        
        for(int i = 0; i < n; i++) {
            sum += arr[i];
            if(sum == 0) maxLength = i + 1;
            if(map.get(sum) != null) {
                maxLength = Math.max(maxLength, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        
        return maxLength;
    }
}
