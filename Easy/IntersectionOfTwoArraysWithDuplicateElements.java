package GeeksForGeeks.Easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArraysWithDuplicateElements {
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        Set<Integer> setA = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for (int num : a) {
            setA.add(num);
        }

        for (int num : b) {
            if (setA.contains(num)) {
                result.add(num);
            }
        }

        return new ArrayList<>(result);
    }
}
