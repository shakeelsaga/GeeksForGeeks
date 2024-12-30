package GeeksForGeeks.Easy;

import java.util.HashSet;
import java.util.Set;

public class UnionOfArraysWithDuplicates {
    public static int findUnion(int a[], int b[]) {
        Set<Integer> set = new HashSet<>();
        
        for(int num : a) {
            set.add(num);
        }
        
        for(int num : b) {
            set.add(num);
        }
        
        return set.size();
    }
}
