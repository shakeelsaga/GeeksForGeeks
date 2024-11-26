package GeeksForGeeks.Hard;

public class MaxCircularSubArraySum {
    public int circularSubarraySum(int arr[]) {
        int n = arr.length;
        
        int localMax = 0;
        int localMin = 0;
        
        int globalMax = Integer.MIN_VALUE;
        int globalMin = Integer.MAX_VALUE;
        
        int sum = 0;
        
        for(int i = 0; i < n; i++) {
            sum += arr[i];
            
            localMax = Math.max(arr[i], localMax + arr[i]);
            localMin = Math.min(arr[i], localMin + arr[i]);
            
            globalMax = Math.max(localMax, globalMax);
            globalMin = Math.min(localMin, globalMin);
        }
        
        if(globalMax < 0) return globalMax;
        
        return Math.max(globalMax, (sum - globalMin));
    }
}
