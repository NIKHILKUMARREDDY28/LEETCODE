class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int one = a.length() - 1,two = b.length()-1;
        int carry = 0;
        while (one >= 0 || two >= 0){
            int sum = carry;
            if(one >= 0) sum += a.charAt(one--) - '0';
            if(two >= 0) sum += b.charAt(two--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if ( carry > 0) sb.append(carry);
        return sb.reverse().toString();
    }
}