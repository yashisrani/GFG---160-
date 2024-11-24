class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int n = arr.length;
        int Largest = -1;
        int SLargest = -1;
        
        
        for(int i= 0 ; i< n ; i++){
            if(arr[i] > Largest){
                SLargest = Largest;
                Largest = arr[i];
            }else if(arr[i] < Largest && arr[i] > SLargest){
                SLargest = arr[i];
            }
        }
        return SLargest;
    }
}