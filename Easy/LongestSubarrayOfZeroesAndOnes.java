package GeeksForGeeks.Easy;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayOfZeroesAndOnes {
    public int maxLen(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            if(arr[i] == 0) {
                arr[i] = -1;
            }
        }
        
        int pre = 0;
        int len = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < n; i++) {
            pre += arr[i];
            
            if(pre == 0) {
                len = i + 1;
            }
            
            if(map.containsKey(pre)) {
                len = Math.max(len, i - (map.get(pre)));
            } else {
                map.put(pre, i);
            }
        }
        
        return len;
    }
}
