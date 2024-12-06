package GeeksForGeeks.Medium;

import java.util.Arrays;

public class FindHIndex {
    public int hIndex(int[] citations) {
       int n = citations.length;
       Arrays.sort(citations);
       
       for(int i = 0; i < n ; i++) {
           if(citations[i] >= n - i) {
               return n - i;
           }
       }
       
       return 0;
    }
}
