package GeeksForGeeks.Medium;

public class NextPermutation {
    private static void reverseArray(int[] arr, int si, int ei) {
        while(si < ei) {
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] =  temp;
            si++;
            ei--;
        }
    }
    
    void nextPermutation(int[] arr) {
        int breakPoint = -1;
        
        for(int i = arr.length - 1; i >= 1; i--) {
            if(arr[i] > arr[i - 1]) {
                breakPoint = i - 1;
                break;
            }
        }
        
        if(breakPoint < 0) {
            reverseArray(arr, 0, arr.length -1);
            return;
        }
        
        for(int j = arr.length - 1; j >= 0; j--) {
            if(arr[j] > arr[breakPoint]) {
                int temp = arr[j];
                arr[j] = arr[breakPoint];
                arr[breakPoint] = temp;
                break;
            }
        }
        
        reverseArray(arr, breakPoint + 1, arr.length -1);
    }
}
