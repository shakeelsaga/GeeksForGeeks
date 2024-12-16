package GeeksForGeeks.Easy;

public class CeilTheFloor {
    public int[] getFloorAndCeil(int x, int[] arr) {
        int floor = Integer.MIN_VALUE;
        int ceil = Integer.MAX_VALUE;
        
        for(int i : arr) {
            if(i > floor && i <= x) floor = i;
            if(i < ceil && i >= x) ceil = i;
        }
        
        floor = (floor == Integer.MIN_VALUE) ? -1 : floor;
        ceil = (ceil == Integer.MAX_VALUE) ? -1 : ceil;
        
        return new int[]{floor, ceil};
    }
}
