package GeeksForGeeks.Medium;

public class CountInversions {
    public static int merge(int arr[], int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;
        int count = 0;
        
        while(idx1 <= mid && idx2 <= ei) {
            if(arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                count += (mid - idx1) + 1;
                merged[x++] = arr[idx2++];
            }
        }
        
        while(idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }
        
        while(idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }
        
        for(int i = 0, j = si; i < ei - si + 1; i++, j++) {
            arr[j] = merged[i];
        }
        
        return count;
    }
    
    
    public static int mergeSort(int[] arr, int si, int ei) {
        int count = 0;
        if(si >= ei) return count;
        int mid = si + (ei - si)/2;
        count += mergeSort(arr, si, mid);
        count += mergeSort(arr, mid + 1, ei);
        count += merge(arr, si, mid, ei);
        return count;
    }
    
    static int inversionCount(int arr[]) {
        return mergeSort(arr, 0, arr.length - 1);
    }
}
