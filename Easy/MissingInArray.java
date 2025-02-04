package GeeksForGeeks.Easy;

public class MissingInArray {
    int missingNumber(int arr[]) {
        int sum1 = 0;
        int sum2 = 0;
        int i = 0;
        while(i < arr.length) {
            sum1 += arr[i];
            sum2 += i+1;
            i += 1; 
        }
        sum2 += i+1;
        
        return sum2 - sum1;
    }
}
