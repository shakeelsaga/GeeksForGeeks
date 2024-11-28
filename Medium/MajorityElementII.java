package GeeksForGeeks.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MajorityElementII {
    public List<Integer> findMajority(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
    
        int count1 = 0, count2 = 0;
        Integer majo1 = null, majo2 = null;
    
        // First loop: find potential majority candidates
        for (int num : nums) {
            if (majo1 != null && num == majo1) {
                count1++;
            } else if (majo2 != null && num == majo2) {
                count2++;
            } else if (count1 == 0) {
                majo1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                majo2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
    
        // Reset counts to verify the candidates
        count1 = 0;
        count2 = 0;
    
        // Second loop: count occurrences of majo1 and majo2
        for (int num : nums) {
            if (majo1 != null && num == majo1) {
                count1++;
            } else if (majo2 != null && num == majo2) {
                count2++;
            }
        }
    
        // Check if counts are greater than n/3
        if (majo1 != null && count1 > n / 3) list.add(majo1);
        if (majo2 != null && count2 > n / 3) list.add(majo2);
    
        // Sort the list to return in increasing order
        Collections.sort(list);
    
        return list;
    }
}
