package GeeksForGeeks.Medium;

public class AllocateMinimumPages {
    private static boolean canBeAllocated(int arr[], int k, int mid) {
        int student = 1;
        int pages = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > mid) {
                return false;
            }
            if(pages + arr[i] > mid) {
                student++;
                pages = arr[i];
            } else {
                pages += arr[i];
            }
        }
        
        return student <= k;
    }
    public static int findPages(int[] arr, int k) {
        if(arr.length < k) return -1;
        int start = 0;
        int end = 0;
        for(int i : arr) {
            end += i;
        }
        
        int minPages = -1;
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(canBeAllocated(arr, k, mid)) {
                minPages = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        
        return minPages;
    }
}
