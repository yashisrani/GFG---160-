class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        int ans = 0;
        int start = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<prices[start]){
                start=i;
            }
            else{
               ans = Math.max(ans,prices[i]-prices[start]);
            }
        }
        return ans;
    }
}
