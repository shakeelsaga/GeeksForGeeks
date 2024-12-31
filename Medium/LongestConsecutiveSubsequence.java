package GeeksForGeeks.Medium;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSubsequence {
    public int longestConsecutive(int[] arr) {
        if(arr.length <= 1) {
            return arr.length;
        }
        
        Set<Integer> set = new HashSet<>(arr.length);
        int len = 0;
        
        for(int i : arr) {
            set.add(i);
        }
        
        for(int i : arr) {
            if(!set.contains(i - 1)) {
                int cnt = 1;
                int temp = i;
                while(set.contains(temp + 1)) {
                    cnt++;
                    temp += 1;
                }
                len = Math.max(len, cnt);
            }
        }
        
        return len;
    }
}
