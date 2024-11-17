package GeeksForGeeks.Easy;

public class ReverseAnArray {
    public void reverseArray(int arr[]) {
        int i = 0, j = arr.length - 1;
        
        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
     }
}
