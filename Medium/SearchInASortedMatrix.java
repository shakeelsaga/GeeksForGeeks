package GeeksForGeeks.Medium;

public class SearchInASortedMatrix {
    public boolean searchMatrix(int[][] mat, int x) {
        int n = mat.length;
        int m = mat[0].length;
        int low = 0;
        int high = (n * m) - 1;
        
        while(low <= high) {
            int mid = low + (high - low)/2;
            
            int i = mid / m;
            int j = mid % m;
            if(mat[i][j] == x) {
                return true;
            } else if(mat[i][j] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return false;
    }
}
