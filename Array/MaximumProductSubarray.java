class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
        int n = arr.length;
        int res = Integer.MIN_VALUE;
        int l = 0, r=0;
        for(int i=0;i<n;i++){
            l=(l==0 ? 1 : l)*arr[i];
            r=(r==0 ? 1 : r)*arr[n-1-i];
            res=Math.max(res,Math.max(l,r));
        }
        return res;
    }
}
