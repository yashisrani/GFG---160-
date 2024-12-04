class Solution {

    // a: input array
    // n: size of array
    // Function to find maximum circular subarray sum.
    public int circularSubarraySum(int arr[]) {

        // Your code here
        int s= 0,maxSum = Integer.MIN_VALUE, minSum= Integer.MAX_VALUE, curr=0,currNeg = 0;
        for(int i:arr){
            s+=i;
            curr = Math.max(curr+i,i);
            maxSum = Math.max(curr,maxSum);
            
            currNeg = Math.min(i,currNeg+i);
            minSum = Math.min(minSum, currNeg);
        }
        if(s == minSum){
            return maxSum;
        }
        return Math.max(maxSum,s-minSum);
    }
}

