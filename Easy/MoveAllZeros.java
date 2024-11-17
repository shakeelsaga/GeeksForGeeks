package GeeksForGeeks.Easy;

public class MoveAllZeros {
    void pushZerosToEnd(int[] arr) {
        int i = 0, j = 0;
        int n = arr.length;

        while(i < n && j < n) {
            if(arr[j] != 0) {
                arr[i] = arr[j];
                i++;
            }
            j++;

            while(i < n && j == n) {
                arr[i++] = 0;
            }
        }
    }
}
