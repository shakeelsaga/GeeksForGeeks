package GeeksForGeeks.Easy;

public class SearchInRowWiseSortedMatrix {
    public boolean searchRowMatrix(int[][] mat, int x) {
        int n = mat.length;
        
        for(int i = 0; i < n; i++) {
            int low = 0;
            int high = mat[0].length - 1;
            while(low <= high) {
                int mid = low + (high - low)/2;
                if(mat[i][mid] == x) {
                    return true;
                } else if(mat[i][mid] < x) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        
        return false;
    }
}
