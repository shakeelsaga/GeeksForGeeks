package GeeksForGeeks.Easy;

import java.util.List;

public class FindKthRotation {
    public int findKRotation(List<Integer> arr) {
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        
        while(low < high) {
            int mid = low + (high - low)/2;
            if(arr.get(mid) > arr.get(high)) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        
        return low;
    }
}
