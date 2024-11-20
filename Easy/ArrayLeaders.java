package GeeksForGeeks.Easy;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeaders {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        if(arr.length == 0) return list;
        
        int n = arr.length;
        list.add(arr[n - 1]);
        
        int i = n - 2;
        while(i >= 0) {
             if(arr[i] >= list.get(list.size() - 1)) {
                list.add(arr[i]); 
             }
             i--;
        }
        
        Collections.reverse(list);
        
        return list;
    }
}
