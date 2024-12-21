package GeeksForGeeks.Easy;

public class RotateArrayAntiClockWise {
    private static void reverseArray(int arr[]) {
        int low = 0;
        int high = arr.length - 1;
        
        while(low < high) {
            int temp = arr[low];
            arr[low++] = arr[high];
            arr[high--] = temp;
        }
    }
    static void rotateby90(int mat[][]) {
        int n = mat.length;
        int m = mat[0].length;
        
        for(int[] i : mat) {
            reverseArray(i);
        }
        
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < m; j++) {
                if(i != j) {
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }
        }
    }
}
