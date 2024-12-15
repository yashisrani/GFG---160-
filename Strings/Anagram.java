class Solution {
    public static boolean areAnagrams(String s1, String s2) {

        // Your code here
         int[] arr = new int[26];
        for(char c : s1.toCharArray()){
            ++arr[c - 'a'];
        }
        
        for(char c : s2.toCharArray()){
            --arr[c - 'a'];
        }
        
        for(int freq : arr){
            if(freq != 0){
                return false;
            }
        }
        
        return true;
    }
}