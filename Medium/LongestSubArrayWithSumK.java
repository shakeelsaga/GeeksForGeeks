package GeeksForGeeks.Medium;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSumK {
 public int lenOfLongestSubarr(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int longLength = 0;
        
        int i = 0;
        while(i < arr.length) {
            sum += arr[i];
            
            if(sum == k) {
                longLength = Math.max(longLength, i + 1);
            }
            
            int prefix = sum - k;
            if(map.containsKey(prefix)) {
                int tempLength = i - map.get(prefix);
                longLength = Math.max(longLength, tempLength);
            }
            
            if(!map.containsKey(sum)) {
                map.put(sum, i);
            }
            
            i++;
        }
        
        return longLength;
        
        
        //Positives only
        // int subLength = 0;    
        // int sum = 0;         
        
        // int i = 0, j = 0;     
        // while(j < arr.length) {
        //     sum += arr[j];    
            
        //     while(sum >= k) {  
        //         if(sum == k) {
        //             subLength = Math.max(subLength, j - i + 1);  
        //         }
        //         sum -= arr[i];    
        //         i++;              
        //     }
        //     j++;                  
        // }
        
        // return subLength; 
    }
}
