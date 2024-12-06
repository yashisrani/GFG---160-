class Solution {
    public int myAtoi(String s) {
        // Your code here
        int sign = 1, result=0,i=0;
        s = s.trim();
        if(i<s.length() && (s.charAt(i)=='-') || (s.charAt(i)=='+')){
            if(s.charAt(i)=='-')
                 sign=-1;
            i++;
        }
        while(i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9'){
            int newNum = s.charAt(i)-'0';
            if(result>Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE/10 && newNum > 7))
                 return sign==-1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            result=result*10 + newNum;
            i++;
        }
        return result*sign;
    }
}
