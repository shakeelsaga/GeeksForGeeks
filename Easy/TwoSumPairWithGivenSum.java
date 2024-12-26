package GeeksForGeeks.Easy;

import java.util.HashSet;

public class TwoSumPairWithGivenSum {
     boolean twoSum(int arr[], int target) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i < arr.length; i++) {
            int req = target - arr[i];
            if(set.contains(req)) {
                return true;
            } else {
                set.add(arr[i]);
            }
        }
        
        return false;
     }    
}
