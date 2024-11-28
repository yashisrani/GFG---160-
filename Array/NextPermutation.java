class Solution {
    void nextPermutation(int[] arr) {
        // code here
        
        int n = arr.length;
        int k = n-2;
        
        // null checks
        if(arr.length==0 || arr==null)return;
        
        // find k
        for(int i=n-1;i>0;i--){
            if(arr[i]<arr[i-1]){
                k--;
            }
            else{
                break;
            }
        }
        
        // if k==-1 reverse
        if(k==-1){
            reverse(arr,0,n-1);
            return;
        }
        
        //else replace k with next greater element reverse
        for(int i=n-1;i>0;i--){
            if(arr[i]>arr[k]){
                int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
                break;
            }
        }
        reverse(arr,k+1,n-1);
    }
    
    void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end-- ;
        }
    }
}