package GeeksForGeeks.Medium;

public class KthElementOfTwoSortedArrays {
    public int kthElement(int a[], int b[], int k) {
        int idx1 = 0;
        int idx2 = 0;
        int pos = 1;
        
        while(idx1 < a.length || idx2 < b.length) {
            int x = (idx1 < a.length) ? a[idx1] : Integer.MAX_VALUE;
            int y = (idx2 < b.length) ? b[idx2] : Integer.MAX_VALUE;
            
            if(x < y) {
                if(k == pos) return x;
                idx1++;
            } else {
                if(k == pos) return y;
                idx2++;
            }
            pos++;
        }
        
        return -1;
    }
}
