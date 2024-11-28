package GeeksForGeeks.Medium;

public class ImplementAtoi {
    public int myAtoi(String s) {
        int n = s.length();
        
        int i = 0;
        while(i < n && s.charAt(i) == ' ') i++;
        
        boolean isNeg = false;
        while(i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if(s.charAt(i) == '-') isNeg = true;
            i++;
        }
        
        int num = 0;
        while(i < n && Character.isDigit(s.charAt(i))) {
            if(num > (Integer.MAX_VALUE - (s.charAt(i)) - '0') / 10) {
                return isNeg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            
            num = (num * 10) + (s.charAt(i) - '0');
            i++;
        }
        
        return isNeg ? -num : num;
    }
}
