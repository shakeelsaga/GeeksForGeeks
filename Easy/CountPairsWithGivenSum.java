package GeeksForGeeks.Easy;

import java.util.HashMap;

public class CountPairsWithGivenSum {
    int countPairs(int arr[], int target) {
        int pairs = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i : arr) {
            if(map.containsKey(target - i)) {
                pairs += map.get(target - i);
            }
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        return pairs;
    }
}
