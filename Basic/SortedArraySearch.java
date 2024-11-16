package GeeksForGeeks.Basic;

public class SortedArraySearch {
    static boolean searchInSorted(int arr[], int k) {
        return binarySearch(arr, k);
    }
    
    private static boolean binarySearch(int arr[], int k) {
        int low = 0, high = arr.length - 1;
        while(low <= high) {
            int mid = low + (high - low)/2;
            if(arr[mid] == k) {
                return true;
            } else if(arr[mid] > k) {
                high = mid - 1;
            } else if(arr[mid] < k) {
                low = mid + 1;
            }
        }
        
        return false;
    }
}
