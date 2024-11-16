package GeeksForGeeks.Basic;

public class LargestElementInArray {
    public static int largest(int[] arr) {
        if(arr.length == 0) return -1;
        
        int large = Integer.MIN_VALUE;
        int i = 0;
        
        while(i < arr.length) {
            if(arr[i] > large) {
                large = arr[i];
            }
            i++;
        }
        
        return large;
     }
}
