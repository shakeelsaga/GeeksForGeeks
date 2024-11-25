package GeeksForGeeks.Medium;

public class MaximumProductSubarray {
    int maxProduct(int[] arr) {
        int maxProduct = Integer.MIN_VALUE;
        int low = 1;
        int high = 1;
        
        for(int i = 0; i < arr.length; i++) {
            low *= arr[i];
            high *= arr[arr.length - i - 1];
            
            maxProduct = Math.max(maxProduct, Math.max(low, high));
            
            if(low == 0) {
                low = 1;
            }
            
            if(high == 0) {
                high = 1;
            }
        }
        
        return maxProduct;
    }
}
