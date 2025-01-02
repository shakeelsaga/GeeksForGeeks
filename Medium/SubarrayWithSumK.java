package GeeksForGeeks.Medium;

import java.util.HashMap;
import java.util.Map;

public class SubarrayWithSumK {
    public int subarraySum(int[] arr, int k) {
        int count = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        
        for (int num : arr) {
            sum += num;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        
        return count;
    }
}
