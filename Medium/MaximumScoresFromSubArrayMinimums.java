package GeeksForGeeks.Medium;

public class MaximumScoresFromSubArrayMinimums {
    public int pairWithMaxSum(int arr[]) {
        if(arr.length == 0 || arr.length == 1) return 0;
        
        int maxScore = Integer.MIN_VALUE;
        
        int i = 0, j = 1;
        while(j < arr.length) {
            maxScore = Math.max(maxScore, arr[i] + arr[j]);
            i++;
            j++;
        }
        
        return maxScore;
     }
}
