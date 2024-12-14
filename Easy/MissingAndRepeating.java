package GeeksForGeeks.Easy;

import java.util.ArrayList;

public class MissingAndRepeating {
    ArrayList<Integer> findTwoElement(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        
        int xor = 0;
        for(int i = 0; i < n; i++) {
            xor ^= arr[i];
            xor ^= i + 1;
        }
        int bit = xor & ~(xor - 1);
        int zeros = 0;
        int ones = 0;
        for(int i = 0; i < n; i++) {
            if((arr[i] & bit) == 0) {
                zeros ^= arr[i];
            } else {
                ones ^= arr[i];
            }
        }
        
        for(int i = 1; i <= n; i++) {
            if((i & bit) == 0) {
                zeros ^= i;
            } else {
                ones ^= i;
            }
        }
        
        int count = 0;
        for(int i : arr) {
            if(i == ones) count++;
        }
        
        if(count == 2) {
            list.add(ones);
            list.add(zeros);
        } else {
            list.add(zeros);
            list.add(ones);
        }
        
        return list;
    }
}
