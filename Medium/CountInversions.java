package GeeksForGeeks.Medium;

public class CountInversions {
    private static int conquer(int arr[], int si, int mid, int ei) {
        int n1 = mid - si + 1;
        int n2 = ei - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
    
        for (int i = 0; i < n1; i++) {
            left[i] = arr[si + i];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = arr[mid + 1 + i];
        }
    
        int i = 0, j = 0, k = si, invCount = 0;
    
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
                invCount += (n1 - i); 
            }
        }
    
        while (i < n1) {
            arr[k++] = left[i++];
        }
    
        while (j < n2) {
            arr[k++] = right[j++];
        }
    
        return invCount;
    }
    
    private static int divide(int arr[], int si, int ei) {
        int invCount = 0;
        if (si < ei) {
            int mid = si + (ei - si) / 2;
    
            invCount += divide(arr, si, mid);
            invCount += divide(arr, mid + 1, ei);
    
            invCount += conquer(arr, si, mid, ei);
        }
        return invCount;
    }
    
    static int inversionCount(int arr[]) {
        return divide(arr, 0, arr.length - 1);
    }
}
