package GeeksForGeeks.Easy;

public class FloorInaSortedArray {
    static int findFloor(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        
        while(low <= high) {
            int mid = low + (high - low)/2;
            if(arr[mid] == k) {
                return mid;
            } else if(arr[mid] > k) {
                high = mid - 1;
            } else {
                if(arr[mid + 1] > k) {
                    return mid;
                } else {
                    low = mid + 1;
                }
                
            }
        }
        
        return -1;
    }
}
