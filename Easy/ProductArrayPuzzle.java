package GeeksForGeeks.Easy;

public class ProductArrayPuzzle {
    public static int[] productExceptSelf(int arr[]) {
        int n = arr.length;
        int prod = 1;
        int zs = 0;
        for(int i : arr) {
            if(i != 0) {
                prod *= i;
            } else {
                zs++;
            }
        }
        
        if(zs == 0) {
            for(int i = 0; i < n; i++) {
                arr[i] = prod/arr[i];
            }
        } else if(zs == 1) {
            for(int i = 0; i < n; i++) {
                if(arr[i] == 0) {
                    arr[i] = prod;
                } else {
                    arr[i] = 0;
                }
            }
        } else {
            for(int i = 0; i < n; i++) {
                arr[i] = 0;
            }
        }
        
        return arr;
    }
}
