package GeeksForGeeks.Medium;

public class RowWithMaxOnes {
    private static int oneIndex(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int ind = arr.length;
        
        while(low <= high) {
            int mid = low + (high - low)/2;
            
            if(arr[mid] == 1) {
                ind = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return ind;
    }
    
    public int rowWithMax1s(int arr[][]) {
       int n = arr.length;
       int m = arr[0].length;
       int oneMax = 0;
       int ind = -1;
       
       for(int i = 0; i < n; i++) {
           int ones = m - oneIndex(arr[i]);
           if(ones > oneMax) {
               oneMax = ones;
               ind = i;
           }
       }
       
       return ind;
    }
}
