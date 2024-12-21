package GeeksForGeeks.Medium;

import java.util.ArrayList;

public class SpirallyTraversingAMatrix {
    public ArrayList<Integer> spirallyTraverse(int mat[][]) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = mat.length;
        int m = mat[0].length;
        
        int top = 0, bottom = n - 1;
        int left = 0, right = m - 1;
        
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                list.add(mat[top][i]);
            }
            top++;
        
            for (int j = top; j <= bottom; j++) {
                list.add(mat[j][right]);
            }
            right--;
        
            if (top <= bottom) {
                for (int k = right; k >= left; k--) {
                    list.add(mat[bottom][k]);
                }
                bottom--;
            }
        
            if (left <= right) {
                for (int l = bottom; l >= top; l--) {
                    list.add(mat[l][left]);
                }
                left++;
            }
        }
        
        return list;
    }
}
