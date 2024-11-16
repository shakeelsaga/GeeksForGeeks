package GeeksForGeeks.Easy;

public class SecondLargest {
    public int getSecondLargest(int[] arr) {
        if(arr.length == 0) return -1;  // Handle empty array
    
        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;
    
        int i = 0;
        while(i < arr.length) {
            if(arr[i] > large) {  // Update largest and second largest
                secondLarge = large;
                large = arr[i];
            } else if(arr[i] > secondLarge && arr[i] != large) {  // Update second largest
                secondLarge = arr[i];
            }
            i++;
        }
        
        return (secondLarge == Integer.MIN_VALUE) ? -1 : secondLarge;  // Return -1 if no second largest found
    }
}
