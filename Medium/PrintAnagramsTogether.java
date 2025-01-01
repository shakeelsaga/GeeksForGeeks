package GeeksForGeeks.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PrintAnagramsTogether {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        Map<String, ArrayList<String>> map = new HashMap<>();
        
        for(String s : arr) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            
            if(!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>(Arrays.asList(s)));
            } else {
                map.get(sortedStr).add(s);
            }
        }
        
        res.addAll(map.values());
        
        return res;
    }
}
