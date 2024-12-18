class Solution {
    // Function to find the first non-repeating character in a string.
    static char nonRepeatingChar(String s) {
        // Your code here
        int[]freq=new int[26];
        
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
         for(char ch:s.toCharArray())
            if(freq[ch-'a']==1) return ch;
        
        
        return '$';
        
    }
}
