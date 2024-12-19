package GeeksForGeeks.Medium;

public class KthMissingPositiveNumberInASortedArray {
    public int kthMissing(int[] arr, int k) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int missing = n + k;
        
        while(low <= high) {
            int mid = low + (high - low)/2;
            if(arr[mid] > k + mid) {
                missing = mid + k;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return missing;
    }
}
