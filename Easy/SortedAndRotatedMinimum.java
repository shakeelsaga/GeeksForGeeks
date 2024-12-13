package GeeksForGeeks.Easy;

public class SortedAndRotatedMinimum {
    public int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        int low = 0;
        int high = arr.length - 1;
        while(low < high) {
            int mid = low + (high - low)/2;
            if(arr[mid] < arr[high]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        
        return arr[low];
    }
}
