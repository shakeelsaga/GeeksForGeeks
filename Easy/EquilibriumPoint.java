package GeeksForGeeks.Easy;

public class EquilibriumPoint {
    public static int findEquilibrium(int arr[]) {
        if(arr.length <= 2) return -1;
        
        int sum = 0;
        for(int i : arr) {
            sum += i;
        }
        
        int sumI = 0;
        for(int i = 0; i < arr.length; i++) {
            int sumJ = sum - arr[i] - sumI;
            
            if(sumI == sumJ) {
                return i;
            }
            
            sumI += arr[i];
        }
        
        return -1;
    }
}
