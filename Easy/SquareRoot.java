package GeeksForGeeks.Easy;

public class SquareRoot {
    int floorSqrt(int n) {
        if(n < 2) return n;
        
        int low = 1;
        int high = n / 2;
        int root = 0;
        
        while(low <= high) {
            int mid = low + (high - low)/2;
            long val = (long) mid * mid;
            
            if(val == n) {
                return mid;
            } else if(val < n) {
                root = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return root;
    }
}
