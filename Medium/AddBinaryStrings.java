package GeeksForGeeks.Medium;

public class AddBinaryStrings {
    public String addBinary(String s1, String s2) {
        StringBuilder str = new StringBuilder();
        
        int n1 = s1.length() - 1;
        int n2 = s2.length() - 1;
        int carry = 0;
        boolean isOne = false;
        
        while(n1 >= 0 || n2 >= 0 || carry == 1) {
            int b1 = (n1 >= 0) ? s1.charAt(n1--) - '0' : 0;
            int b2 = (n2 >= 0) ? s2.charAt(n2--) - '0' : 0;
            
            int val = b1 + b2 + carry;
            carry = val / 2;
            val = val % 2;
            //if(val == 1) isOne = true;
            
            str.append(val);
        }
        
        int i = str.length() - 1;
        while(i >= 0 && str.charAt(i) != '1') {
            str.deleteCharAt(i--);
        }
        
        if(str.length() == 0) {
            str.append('0');
        }
        
        return str.reverse().toString();
     }
}
