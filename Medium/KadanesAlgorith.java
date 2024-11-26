package GeeksForGeeks.Medium;

public class KadanesAlgorith {
    int maxSubarraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
            
            maxSum = Math.max(maxSum, sum);
            
            if(sum < 0) {
                sum = 0;
            }
        }
        
        return maxSum;
     }
}
