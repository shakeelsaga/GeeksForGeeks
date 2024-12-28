package GeeksForGeeks.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAllTripletsWithSumZero {
    public List<List<Integer>> findTriplets(int[] arr) {
        int n = arr.length;
        List<List<Integer>> result = new ArrayList<>();
        HashMap<Integer, ArrayList<Integer>> indexMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            indexMap.putIfAbsent(arr[i], new ArrayList<>());
            indexMap.get(arr[i]).add(i);
        }

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                int target = -(arr[i] + arr[j]);
                
                if (indexMap.get(target) != null) {
                    int size = indexMap.get(target).size();

                    for (int k = size - 1; k >= 0; k--) {
                        if (indexMap.get(target).get(k) <= j) break;
                        result.add(new ArrayList<>(List.of(i, j, indexMap.get(target).get(k))));
                    }
                }
            }
        }

        result.sort((o1, o2) -> o1.get(2).compareTo(o2.get(2)));
        return result;
    }
}
